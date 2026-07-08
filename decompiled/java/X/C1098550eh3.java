package X;

import Y.ATListenerS450S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerNewCarouselSetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0eh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098550eh3 extends AbstractC1098270egb implements InterfaceC1141530foN {
    public final DataChannel LLIZLLLIL;
    public final LifecycleOwner LLJ;
    public final boolean LLJI;
    public final Function1<BannerInRoom, Boolean> LLJIJIL;
    public C20632315oP LLJILJIL;
    public C1098700ehI LLJILJILJ;
    public AnonymousClass0956 LLJILLL;
    public AnonymousClass0956 LLJJ;
    public final long LLJJI;
    public final long LLJJIII;
    public final boolean LLJJIJI;
    public C1098400ego LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final long LLJJJIL;
    public final long LLJJJJ;
    public final long LLJJJJJIL;
    public final SparseIntArray LLJJJJLIIL;
    public volatile boolean LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;
    public final Map<Integer, String> LLJL;
    public final Map<Long, C1098390egn> LLJLIL;

    @Override // X.AbstractC1098270egb
    public final void LIZJ() {
        C20632315oP c20632315oP;
        AbstractC1098620ehA abstractC1098620ehA;
        C1098700ehI c1098700ehI = this.LLJILJILJ;
        if ((c1098700ehI instanceof C1098700ehI) && c1098700ehI != null && (c20632315oP = this.LLJILJIL) != null) {
            int currentItem = c20632315oP.getCurrentItem();
            RecyclerView recyclerView = c1098700ehI.LLILZIL;
            if (recyclerView != null) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(currentItem);
                if ((viewHolderFindViewHolderForAdapterPosition instanceof AbstractC1098620ehA) && (abstractC1098620ehA = (AbstractC1098620ehA) viewHolderFindViewHolderForAdapterPosition) != null) {
                    abstractC1098620ehA.T5();
                }
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILLL = null;
        C1548820qPI.LJIIIIZZ("live_banner_panel_dismiss", this);
        C1548820qPI.LJIIIIZZ("live_banner_panel_tab_scrolled", this);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0egZ] */
    @Override // X.AbstractC1098270egb
    public final void LJIIIIZZ() {
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILZIL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.M1();
        }
        Context context = this.LL;
        if (context != null) {
            C20632315oP c20632315oP = new C20632315oP(context);
            c20632315oP.setOrientation(0);
            C1098700ehI c1098700ehI = new C1098700ehI(this.LLILLJJLI, new InterfaceC1098680ehG() { // from class: X.0egZ
                /* JADX WARN: Removed duplicated region for block: B:101:0x0251  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x027b  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x02d9  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x031e  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x0337  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x035d  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x035f  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x037b  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x037e  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0381  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x038f  */
                /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[ORIG_RETURN, RETURN] */
                @Override // X.InterfaceC1098680ehG
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r21, int r22, com.bytedance.android.livesdk.model.BannerInRoom r23) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 923
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1098250egZ.LIZ(android.view.View, int, com.bytedance.android.livesdk.model.BannerInRoom):void");
                }
            }, new AwS596S0100000_17(this, 297), this.LLIZLLLIL);
            this.LLJILJILJ = c1098700ehI;
            c20632315oP.setAdapter(c1098700ehI);
            C1098400ego c1098400ego = new C1098400ego(this.LLILLJJLI, this.LLILZIL, this.LLJLIL);
            this.LLJJIJIIJIL = c1098400ego;
            c20632315oP.LIZIZ(c1098400ego);
            c20632315oP.LIZIZ(new C1151520g4U(this, 1));
            c20632315oP.LIZIZ(new C1151520g4U(this, 2));
            this.LLJILJIL = c20632315oP;
            int size = 1073741823 - (1073741823 % this.LLILLJJLI.size());
            C20632315oP c20632315oP2 = this.LLJILJIL;
            if (c20632315oP2 != null) {
                c20632315oP2.LJ(size, false);
            }
            this.LLJJIJIL = true;
        }
        NewTopRightBannerWidget newTopRightBannerWidget2 = this.LLILZIL;
        if (newTopRightBannerWidget2 != null) {
            newTopRightBannerWidget2.N1(0, this.LLILLJJLI);
        }
        if (this.LLJJIJI) {
            C1548820qPI.LIZLLL("live_banner_panel_dismiss", this);
            C1548820qPI.LIZLLL("live_banner_panel_tab_scrolled", this);
        }
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            C20632315oP c20632315oP3 = this.LLJILJIL;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(c20632315oP3);
        }
    }

    @Override // X.AbstractC1098270egb
    public final boolean LJIIIZ() {
        return (this.LLJJL || this.LLJJLIIIJLLLLLLLZ) ? false : true;
    }

    @Override // X.AbstractC1098270egb
    public final void LJIIJ() {
        View childAt;
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLILZIL;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.O1();
        }
        if (this.LLILLJJLI.size() > 1) {
            C20632315oP c20632315oP = this.LLJILJIL;
            if (c20632315oP != null && (childAt = c20632315oP.getChildAt(0)) != null) {
                childAt.setOnTouchListener(new ATListenerS450S0100000_17(this, 5));
            }
            LJJIII();
        }
    }

    public final Pair<Integer, BannerInRoom> LJJI() {
        int size = this.LLILLJJLI.size();
        if (size <= 0) {
            return null;
        }
        C20632315oP c20632315oP = this.LLJILJIL;
        int currentItem = (c20632315oP != null ? c20632315oP.getCurrentItem() : 0) % size;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(currentItem, this.LLILLJJLI);
        if (objLJJJLZIJ == null) {
            return null;
        }
        return new Pair<>(Integer.valueOf(currentItem), objLJJJLZIJ);
    }

    public final void LJJIII() {
        if (this.LLILLJJLI.size() <= 1) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LLJILLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLJ), null, null, new C1098570eh5(this, null), 3);
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIILL() {
        long j;
        Pair<Integer, BannerInRoom> pairLJJI = LJJI();
        if (pairLJJI != null) {
            int iIntValue = pairLJJI.getFirst().intValue();
            BannerInRoom second = pairLJJI.getSecond();
            C1098390egn c1098390egn = (C1098390egn) ((LinkedHashMap) this.LLJLIL).get(Long.valueOf(second.id));
            NewTopRightBannerWidget newTopRightBannerWidget = this.LLILZIL;
            if (newTopRightBannerWidget != null) {
                long j2 = -1;
                if (c1098390egn != null) {
                    j = c1098390egn.LIZ;
                    j2 = c1098390egn.LIZLLL;
                } else {
                    j = -1;
                }
                newTopRightBannerWidget.LJJJJZI(iIntValue, second, "exit", j, j2, c1098390egn != null ? c1098390egn.LIZJ : 0);
            }
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIILLIIL() {
        Pair<Integer, BannerInRoom> pairLJJI = LJJI();
        if (pairLJJI == null) {
            return;
        }
        pairLJJI.getFirst().intValue();
        BannerInRoom second = pairLJJI.getSecond();
        C1098390egn c1098390egn = (C1098390egn) ((LinkedHashMap) this.LLJLIL).get(Long.valueOf(second.id));
        if (c1098390egn != null) {
            c1098390egn.LIZ = System.currentTimeMillis();
        }
    }

    @Override // X.AbstractC1098270egb
    public final View LJFF() {
        return this.LLJILJIL;
    }

    public static final String LJJIFFI(BannerInRoom bannerInRoom) {
        n nVarLJFF;
        k kVarLJJIIZ;
        if (bannerInRoom == null) {
            return "";
        }
        if (a0.LJLIIIL(bannerInRoom.schemaUrl).toString().length() > 0) {
            return bannerInRoom.schemaUrl;
        }
        String str = bannerInRoom.dynamicBanner.jsonResource;
        if (str == null || (nVarLJFF = C2348809Ig.LJFF(str)) == null || (kVarLJJIIZ = nVarLJFF.LJJIIZ("jumpSchema")) == null) {
            return null;
        }
        return kVarLJJIIZ.LJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1098270egb
    public final void LJIIZILJ(List<? extends BannerInRoom> list) {
        C0IQR c0iqr;
        this.LLILLJJLI = list;
        C20632315oP c20632315oP = this.LLJILJIL;
        if (c20632315oP != null) {
            c20632315oP.setUserInputEnabled(false);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILLL = null;
        C1098700ehI c1098700ehI = this.LLJILJILJ;
        if ((c1098700ehI instanceof C0IQR) && (c0iqr = (C0IQR) c1098700ehI) != null) {
            c0iqr.LL = this.LLILLJJLI;
        }
        if ((c1098700ehI instanceof C1098700ehI) && c1098700ehI != 0) {
            c1098700ehI.LL = this.LLILLJJLI;
        }
        if (c1098700ehI != 0) {
            c1098700ehI.notifyDataSetChanged();
        }
        int size = 1073741823 - (1073741823 % this.LLILLJJLI.size());
        C20632315oP c20632315oP2 = this.LLJILJIL;
        if (c20632315oP2 != null) {
            c20632315oP2.LJ(size, false);
        }
        this.LLJJIJIL = true;
        LJJIII();
        C20632315oP c20632315oP3 = this.LLJILJIL;
        if (c20632315oP3 != null) {
            c20632315oP3.setUserInputEnabled(true);
        }
        SparseIntArray sparseIntArray = this.LLJJJJLIIL;
        Iterator<? extends BannerInRoom> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                sparseIntArray.put(i, 0);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIJJ(C1098290egd c1098290egd) {
        C20632315oP c20632315oP = this.LLJILJIL;
        if (c20632315oP == null) {
            return;
        }
        int currentItem = c20632315oP.getCurrentItem();
        this.LLJJL = true;
        AbstractC21673619ry adapter = c20632315oP.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(currentItem, EnumC1098640ehC.START);
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LJIL(C1098290egd c1098290egd) {
        C20632315oP c20632315oP = this.LLJILJIL;
        if (c20632315oP == null) {
            return;
        }
        int currentItem = c20632315oP.getCurrentItem();
        this.LLJJL = false;
        AbstractC21673619ry adapter = c20632315oP.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(currentItem, EnumC1098640ehC.START);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "live_banner_panel_dismiss")) {
            LJJIII();
            return;
        }
        if (!Intrinsics.LJFF(str, "live_banner_panel_tab_scrolled")) {
            return;
        }
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "bannerId", "");
        } else {
            strLJFF = null;
        }
        Iterator<? extends BannerInRoom> it2 = this.LLILLJJLI.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(String.valueOf(it2.next().id), strLJFF)) {
                if (i < 0) {
                    return;
                }
                C1098400ego c1098400ego = this.LLJJIJIIJIL;
                if (c1098400ego != null) {
                    c1098400ego.LLILZIL = EnumC1098310egf.PANEL_ITEM_SCROLL;
                }
                C20632315oP c20632315oP = this.LLJILJIL;
                if (c20632315oP == null) {
                    return;
                }
                int currentItem = i - c20632315oP.getCurrentItem();
                C20632315oP c20632315oP2 = this.LLJILJIL;
                if (c20632315oP2 == null) {
                    return;
                }
                c20632315oP2.LJ(i + currentItem, true);
                return;
            }
            i++;
        }
    }

    public static C1098290egd LJJ(BannerInRoom bannerInRoom, String str) {
        int i;
        int i2;
        String string = str;
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        String str2 = bannerInRoom.activityId;
        if (str2 != null && str2.length() != 0) {
            i = 30;
        } else {
            i = 25;
        }
        String str3 = bannerInRoom.activityId;
        if (str3 != null && str3.length() != 0) {
            i2 = 59;
        } else {
            i2 = 42;
        }
        return new C1098290egd(string, 3, i, i2, Mp4ScreenVideoLoadTimeout.CONTROL, null, null);
    }

    public final void LJJII(EnumC1098600eh8 enumC1098600eh8, EnumC1098600eh8 enumC1098600eh82) {
        if (C1098480egw.LIZ[enumC1098600eh82.ordinal()] == 1) {
            C20632315oP c20632315oP = this.LLJILJIL;
            if (c20632315oP != null) {
                c20632315oP.setUserInputEnabled(true);
            }
        } else {
            C20632315oP c20632315oP2 = this.LLJILJIL;
            if (c20632315oP2 != null) {
                c20632315oP2.setUserInputEnabled(false);
            }
        }
        NewTopRightBannerWidget newTopRightBannerWidget = this.LLIZ;
        if (newTopRightBannerWidget != null) {
            newTopRightBannerWidget.P1(enumC1098600eh82);
        }
        C20632315oP c20632315oP3 = this.LLJILJIL;
        if (c20632315oP3 != null) {
            Pair pair = new Pair(enumC1098600eh82, Float.valueOf(1.0f));
            AbstractC21673619ry adapter = c20632315oP3.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(c20632315oP3.getCurrentItem(), pair);
            }
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LIZ(int i, int i2, C1098290egd c1098290egd) {
        C092100Wh.LIZ(c1098290egd.LIZ, this.LLJL);
        C20632315oP c20632315oP = this.LLJILJIL;
        if (c20632315oP != null) {
            C1098650ehD.LIZ(c20632315oP, i2, new InterfaceC1098670ehF() { // from class: X.0eh6
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }

                @Override // X.InterfaceC1098670ehF
                public final void LJ(float f) {
                    C1098550eh3 c1098550eh3 = this.LL;
                    EnumC1098600eh8 enumC1098600eh8 = EnumC1098600eh8.COLLAPSING;
                    C20632315oP c20632315oP2 = c1098550eh3.LLJILJIL;
                    if (c20632315oP2 != null) {
                        Pair pair = new Pair(enumC1098600eh8, Float.valueOf(f));
                        AbstractC21673619ry adapter = c20632315oP2.getAdapter();
                        if (adapter != null) {
                            adapter.notifyItemChanged(c20632315oP2.getCurrentItem(), pair);
                        }
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LL.LJJII(EnumC1098600eh8.EXPAND, EnumC1098600eh8.COLLAPSING);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator, boolean z) {
                    this.LL.LJJII(EnumC1098600eh8.COLLAPSING, EnumC1098600eh8.COLLAPSE);
                    this.LL.LLJJLIIIJLLLLLLLZ = false;
                }
            });
        }
    }

    @Override // X.AbstractC1098270egb
    public final void LIZLLL(int i, int i2, C1098290egd c1098290egd) {
        C20632315oP c20632315oP = this.LLJILJIL;
        if (c20632315oP != null) {
            C1098650ehD.LIZ(c20632315oP, i2, new InterfaceC1098670ehF() { // from class: X.0eh7
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }

                @Override // X.InterfaceC1098670ehF
                public final void LJ(float f) {
                    C1098550eh3 c1098550eh3 = this.LL;
                    EnumC1098600eh8 enumC1098600eh8 = EnumC1098600eh8.EXPANDING;
                    C20632315oP c20632315oP2 = c1098550eh3.LLJILJIL;
                    if (c20632315oP2 != null) {
                        Pair pair = new Pair(enumC1098600eh8, Float.valueOf(f));
                        AbstractC21673619ry adapter = c20632315oP2.getAdapter();
                        if (adapter != null) {
                            adapter.notifyItemChanged(c20632315oP2.getCurrentItem(), pair);
                        }
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.LL.LJJII(EnumC1098600eh8.EXPANDING, EnumC1098600eh8.EXPAND);
                    this.LL.LLJJLIIIJLLLLLLLZ = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LL.LJJII(EnumC1098600eh8.COLLAPSE, EnumC1098600eh8.EXPANDING);
                }
            });
        }
        C500260Jjc.LJJJJJ(this.LLJ, null, new C1098540eh2(this, c1098290egd, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1098550eh3(Context context, List list, DataChannel dataChannel, LifecycleOwner lifecycleOwner, boolean z, AFwS254S0000000_17 aFwS254S0000000_17) {
        long j;
        long j2;
        boolean z2;
        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel);
        super(context, list, zLJIIZILJ, C500260Jjc.LJJLIIIIJ(dataChannel));
        this.LLIZLLLIL = dataChannel;
        this.LLJ = lifecycleOwner;
        this.LLJI = z;
        this.LLJIJIL = aFwS254S0000000_17;
        LiveBannerConfigSetting liveBannerConfigSetting = LiveBannerConfigSetting.INSTANCE;
        LiveBannerConfigSetting.BannerConfig value = liveBannerConfigSetting.getValue();
        if (zLJIIZILJ) {
            j = value.anchorInterval;
        } else {
            j = value.normalInterval;
        }
        this.LLJJI = j;
        LiveBannerConfigSetting.BannerConfig value2 = liveBannerConfigSetting.getValue();
        if (zLJIIZILJ) {
            j2 = value2.firstAnchorInterval;
        } else {
            j2 = value2.firstNormalInterVal;
        }
        this.LLJJIII = j2;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((BannerInRoom) it2.next()).openWithNavigationTag) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        this.LLJJIJI = z2;
        this.LLJJIJIL = true;
        this.LLJJJ = LiveBannerNewCarouselSetting.INSTANCE.getValue();
        LiveBannerConfigSetting liveBannerConfigSetting2 = LiveBannerConfigSetting.INSTANCE;
        this.LLJJJIL = liveBannerConfigSetting2.getValue().totalCarouselIntervalAnchor;
        this.LLJJJJ = liveBannerConfigSetting2.getValue().totalNewCarouselCount;
        this.LLJJJJJIL = liveBannerConfigSetting2.getValue().minCarouselIntervalAnchor;
        SparseIntArray sparseIntArray = new SparseIntArray(list.size());
        Iterator it3 = list.iterator();
        int i = 0;
        while (it3.hasNext()) {
            it3.next();
            int i2 = i + 1;
            if (i >= 0) {
                sparseIntArray.put(i, 0);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLJJJJLIIL = sparseIntArray;
        this.LLJL = new LinkedHashMap();
        this.LLJLIL = new LinkedHashMap();
    }
}
