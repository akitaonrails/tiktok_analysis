package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455320HtK extends AbstractC21673619ry<C455330HtL> {
    public List<C455420HtU> LL;
    public List<StickerItem> LLILLJJLI;
    public InterfaceC455400HtS LLILLL;
    public List<C455370HtP> LLILZ;

    public final void LLLI() {
        List<StickerItem> list = this.LLILLJJLI;
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<StickerItem> it2 = list.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                final List<C455370HtP> list2 = this.LLILZ;
                C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new AbstractC21342018fa(list2, arrayList) { // from class: X.0HtM
                    public final List<C455370HtP> LIZ;
                    public final List<C455370HtP> LIZIZ;

                    @Override // X.AbstractC21342018fa
                    public final int LIZLLL() {
                        return this.LIZIZ.size();
                    }

                    @Override // X.AbstractC21342018fa
                    public final int LJ() {
                        return this.LIZ.size();
                    }

                    {
                        this.LIZ = list2;
                        this.LIZIZ = arrayList;
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZ(int i, int i2) {
                        C455370HtP c455370HtP;
                        C455370HtP c455370HtP2 = (C455370HtP) C13LP.LJJJLZIJ(i, this.LIZ);
                        if (c455370HtP2 == null || (c455370HtP = (C455370HtP) C13LP.LJJJLZIJ(i2, this.LIZIZ)) == null || c455370HtP2.LIZIZ != c455370HtP.LIZIZ) {
                            return false;
                        }
                        return true;
                    }

                    @Override // X.AbstractC21342018fa
                    public final boolean LIZIZ(int i, int i2) {
                        C455370HtP c455370HtP;
                        Long l;
                        Long l2;
                        Long l3;
                        C455370HtP c455370HtP2 = (C455370HtP) C13LP.LJJJLZIJ(i, this.LIZ);
                        if (c455370HtP2 == null || (c455370HtP = (C455370HtP) C13LP.LJJJLZIJ(i2, this.LIZIZ)) == null) {
                            return false;
                        }
                        StickerBase stickerBase = c455370HtP2.LIZ.stickerBase;
                        Long l4 = null;
                        if (stickerBase != null) {
                            l = stickerBase.id;
                        } else {
                            l = null;
                        }
                        StickerBase stickerBase2 = c455370HtP.LIZ.stickerBase;
                        if (stickerBase2 != null) {
                            l2 = stickerBase2.id;
                        } else {
                            l2 = null;
                        }
                        if (!Intrinsics.LJFF(l, l2)) {
                            return false;
                        }
                        SocialAvatarStickerItem socialAvatarStickerItem = c455370HtP2.LIZ.socialAvatarInfo;
                        if (socialAvatarStickerItem != null) {
                            l3 = socialAvatarStickerItem.userId;
                        } else {
                            l3 = null;
                        }
                        SocialAvatarStickerItem socialAvatarStickerItem2 = c455370HtP.LIZ.socialAvatarInfo;
                        if (socialAvatarStickerItem2 != null) {
                            l4 = socialAvatarStickerItem2.userId;
                        }
                        if (!Intrinsics.LJFF(l3, l4) || !Intrinsics.LJFF(c455370HtP2.LIZ.stickerVariant, c455370HtP.LIZ.stickerVariant)) {
                            return false;
                        }
                        return true;
                    }

                    @Override // X.AbstractC21342018fa
                    public final Object LIZJ(int i, int i2) {
                        C455370HtP c455370HtP = (C455370HtP) C13LP.LJJJLZIJ(i2, this.LIZIZ);
                        if (c455370HtP == null) {
                            return null;
                        }
                        return new C455390HtR(c455370HtP.LIZIZ);
                    }
                }, true);
                this.LLILZ = arrayList;
                c21341918fZLIZ.LIZJ(this);
                return;
            }
            StickerItem next = it2.next();
            List<C455420HtU> list3 = this.LL;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                z = false;
            } else {
                for (C455420HtU c455420HtU : list3) {
                    StickerBase stickerBase = next.stickerBase;
                    if (stickerBase != null) {
                        long j = c455420HtU.LIZIZ;
                        Long l = stickerBase.id;
                        if (l == null || j != l.longValue()) {
                        }
                    }
                }
                z = false;
            }
            arrayList.add(new C455370HtP(next, z));
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    public C455320HtK(C13BV c13bv, C13BV c13bv2) {
        C455380HtQ c455380HtQ = new InterfaceC455400HtS() { // from class: X.0HtQ
            @Override // X.InterfaceC455400HtS
            public final void LIZ(InterfaceC879330YeZ interfaceC879330YeZ) {
            }
        };
        this.LL = c13bv;
        this.LLILLJJLI = c13bv2;
        this.LLILLL = c455380HtQ;
        this.LLILZ = C13BV.INSTANCE;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C455330HtL c455330HtL, int i) {
        StickerImage stickerImage;
        List<String> list;
        SocialAvatarStickerItem socialAvatarStickerItem;
        Long l;
        Long l2;
        C1331670kl3 c1331670kl3LJIIIIZZ;
        List<String> urlList;
        C455370HtP c455370HtP = (C455370HtP) C13LP.LJJJLZIJ(i, this.LLILZ);
        if (c455370HtP == null) {
            return;
        }
        StickerItem stickerItem = c455370HtP.LIZ;
        c455330HtL.getClass();
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null && (stickerImage = stickerBase.image) != null && (list = stickerImage.urlList) != null && (socialAvatarStickerItem = stickerItem.socialAvatarInfo) != null && (l = socialAvatarStickerItem.userId) != null) {
            long jLongValue = l.longValue();
            StickerBase stickerBase2 = stickerItem.stickerBase;
            if (stickerBase2 != null && (l2 = stickerBase2.id) != null) {
                UrlModel urlModelLJIIIIZZ = null;
                c455330HtL.LLILLL = new C455420HtU(jLongValue, l2.longValue(), new C0Z70(null, list, 0, 0), C453560HqU.LIZ(stickerItem));
                Integer num = stickerItem.stickerVariant;
                StickerVariant.Companion.getClass();
                if (num != null && num.intValue() == 2) {
                    StickerImage stickerImage2 = stickerBase.thumbnail;
                    if (stickerImage2 != null) {
                        urlModelLJIIIIZZ = C453560HqU.LJIIIIZZ(stickerImage2);
                    }
                } else {
                    StickerImage stickerImage3 = stickerBase.image;
                    if (stickerImage3 != null) {
                        urlModelLJIIIIZZ = C453560HqU.LJIIIIZZ(stickerImage3);
                    }
                }
                if (urlModelLJIIIIZZ != null && (urlList = urlModelLJIIIIZZ.getUrlList()) != null && urlList.size() == 1) {
                    c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ((String) C13LP.LJJJJZI(urlModelLJIIIIZZ.getUrlList()));
                } else {
                    c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModelLJIIIIZZ));
                }
                c1331670kl3LJIIIIZZ.LIZLLL = true;
                C1332130kln.LIZJ(c1331670kl3LJIIIIZZ, C06TB.STABLE_STICKER);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
                c1331670kl3LJIIIIZZ.LIZLLL("AimojiViewHolder");
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIIZZ.LJJ(c455330HtL.LL);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        c455330HtL.I5(c455370HtP.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0HtO] */
    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        SmartImageView smartImageView = new SmartImageView(viewGroup.getContext());
        C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(C341940Daq.LIZ(60.0d), C341940Daq.LIZ(60.0d)));
        C455330HtL c455330HtL = new C455330HtL(smartImageView, new InterfaceC455400HtS() { // from class: X.0HtO
            @Override // X.InterfaceC455400HtS
            public final void LIZ(InterfaceC879330YeZ interfaceC879330YeZ) {
                this.LIZ.LLILLL.LIZ(interfaceC879330YeZ);
            }
        });
        try {
            View view = c455330HtL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c455330HtL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c455330HtL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C455330HtL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c455330HtL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c455330HtL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C455330HtL.class.getName();
        return c455330HtL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C455330HtL c455330HtL = (C455330HtL) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(c455330HtL, i);
            return;
        }
        for (Object obj : list) {
            if (obj instanceof C455390HtR) {
                c455330HtL.I5(((C455390HtR) obj).LIZ);
            }
        }
    }
}
