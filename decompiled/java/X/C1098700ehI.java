package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.livesetting.banner.LiveNewFrameworkBannerImageBgEnableSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import webcast.data.ExtendImage;
import webcast.data.ImageInfo;
import wh6.AbS154S0201000_17;

/* JADX INFO: renamed from: X.0ehI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098700ehI extends AbstractC21673619ry<AbstractC1098620ehA> {
    public List<? extends BannerInRoom> LL;
    public final InterfaceC1098680ehG LLILLJJLI;
    public final Function1<BannerInRoom, Unit> LLILLL;
    public final DataChannel LLILZ;
    public RecyclerView LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size() != 1 ? Integer.MAX_VALUE : 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Long l;
        ExtendImage extendImage;
        BannerInRoom bannerInRoom = (BannerInRoom) ListProtector.get(this.LL, i % this.LL.size());
        Long l2 = bannerInRoom.businessType;
        if (((l2 == null || l2.longValue() != 0) && ((l = bannerInRoom.businessType) == null || l.longValue() != 1)) || (extendImage = bannerInRoom.extendImage) == null || extendImage.expandedImage == null || extendImage.foldedImage == null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZIL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILZIL = null;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC1098620ehA abstractC1098620ehA = (AbstractC1098620ehA) viewHolder;
        int size = i % this.LL.size();
        BannerInRoom bannerInRoom = (BannerInRoom) ListProtector.get(this.LL, size);
        abstractC1098620ehA.N5(bannerInRoom);
        C786410Ut5.I7(new AbS154S0201000_17(this, bannerInRoom, size, 1), abstractC1098620ehA.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        RecyclerView.ViewHolder c1098900ehc;
        if (i == 1) {
            i2 = R.layout.gw0;
        } else {
            i2 = R.layout.gvz;
        }
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false);
        if (i == 1) {
            c1098900ehc = new C1098900ehc(viewTd, this.LLILLL, this.LLILZ);
        } else {
            final DataChannel dataChannel = this.LLILZ;
            c1098900ehc = new AbstractC1098620ehA(viewTd, dataChannel) { // from class: X.0eXI
                public final DataChannel LL;
                public final ImageView LLILLJJLI;
                public final ImageView LLILLL;
                public BannerInRoom LLILZ;

                @Override // X.AbstractC1098620ehA
                public final void P5(EnumC1098600eh8 enumC1098600eh8, float f) {
                }

                @Override // X.AbstractC1098620ehA
                public final void I5() {
                    ImageInfo imageInfo;
                    BannerInRoom bannerInRoom = this.LLILZ;
                    if (bannerInRoom == null) {
                        return;
                    }
                    C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                    ExtendImage extendImage = bannerInRoom.extendImage;
                    C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ((extendImage == null || (imageInfo = extendImage.expandedImage) == null) ? null : imageInfo.image);
                    c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                    c1324610kZfLJIIIZ.LJJI(this.LLILLL);
                }

                @Override // X.AbstractC1098620ehA
                public final void N5(BannerInRoom bannerInRoom) {
                    ImageModel imageModel;
                    int iLIZIZ;
                    ImageInfo imageInfo;
                    this.LLILZ = bannerInRoom;
                    C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                    ExtendImage extendImage = bannerInRoom.extendImage;
                    if (extendImage != null && (imageInfo = extendImage.foldedImage) != null) {
                        imageModel = imageInfo.image;
                    } else {
                        imageModel = null;
                    }
                    C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
                    c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                    c1324610kZfLJIIIZ.LJJI(this.LLILLJJLI);
                    if (LiveNewFrameworkBannerImageBgEnableSetting.INSTANCE.getValue()) {
                        if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(C500260Jjc.LJJLIIIIJ(this.LL), null)) {
                            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ep5, C1834150xpV.LJII(this.itemView.getContext()));
                        } else {
                            iLIZIZ = C20736316Cj.LIZIZ(R.attr.exm, C1834150xpV.LJII(this.itemView.getContext()));
                        }
                        View view = this.itemView;
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(8.0f));
                        gradientDrawable.setColor(iLIZIZ);
                        view.setBackground(gradientDrawable);
                    }
                }

                {
                    super(viewTd);
                    this.LL = dataChannel;
                    this.LLILLJJLI = (ImageView) viewTd.findViewById(R.id.l_j);
                    this.LLILLL = (ImageView) viewTd.findViewById(R.id.l_k);
                }

                @Override // X.AbstractC1098620ehA
                public final void R5(BannerInRoom bannerInRoom, EnumC1098600eh8 enumC1098600eh8) {
                    int i3 = C1098340egi.LIZ[enumC1098600eh8.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    throw new C1954807lC();
                                }
                                return;
                            } else {
                                C500260Jjc.LJIILIIL(this.LLILLJJLI);
                                C500260Jjc.LLFFF(this.LLILLL);
                                return;
                            }
                        }
                        C500260Jjc.LLFFF(this.LLILLJJLI);
                        C500260Jjc.LJIILIIL(this.LLILLL);
                        return;
                    }
                    C500260Jjc.LLFFF(this.LLILLL);
                    C500260Jjc.LJIILIIL(this.LLILLJJLI);
                }
            };
        }
        try {
            View view = c1098900ehc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1098900ehc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1098900ehc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1098900ehc.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1098900ehc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1098900ehc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1098900ehc.getClass().getName();
        return c1098900ehc;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        AbstractC1098620ehA abstractC1098620ehA = (AbstractC1098620ehA) viewHolder;
        BannerInRoom bannerInRoom = (BannerInRoom) ListProtector.get(this.LL, i % this.LL.size());
        Object objLJJLIIIJL = C13LP.LJJLIIIJL(list);
        if (objLJJLIIIJL instanceof Pair) {
            Pair pair = (Pair) objLJJLIIIJL;
            Object first = pair.getFirst();
            Object second = pair.getSecond();
            if ((first instanceof EnumC1098600eh8) && (second instanceof Float)) {
                EnumC1098600eh8 enumC1098600eh8 = (EnumC1098600eh8) first;
                abstractC1098620ehA.R5(bannerInRoom, enumC1098600eh8);
                abstractC1098620ehA.P5(enumC1098600eh8, ((Number) second).floatValue());
                return;
            }
            return;
        }
        if (objLJJLIIIJL instanceof EnumC1098640ehC) {
            abstractC1098620ehA.S5((EnumC1098640ehC) objLJJLIIIJL);
        } else {
            super.onBindViewHolder(abstractC1098620ehA, i, list);
        }
    }

    public C1098700ehI(List list, C1098250egZ c1098250egZ, AwS596S0100000_17 awS596S0100000_17, DataChannel dataChannel) {
        this.LL = list;
        this.LLILLJJLI = c1098250egZ;
        this.LLILLL = awS596S0100000_17;
        this.LLILZ = dataChannel;
    }
}
