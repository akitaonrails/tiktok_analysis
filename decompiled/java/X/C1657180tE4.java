package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.aweme.sticker.StickerWrapper;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0tE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657180tE4 extends AbstractC21673619ry<C1657330tEJ> implements InterfaceC1657310tEH {
    public final ShortVideoContext LL;
    public final InterfaceC1635410sex LLILLJJLI;
    public final C1657190tE5 LLILLL;
    public List<? extends StickerWrapper> LLILZ = new ArrayList();
    public int LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(int r8) {
        /*
            r7 = this;
            java.util.List<? extends com.ss.android.ugc.aweme.sticker.StickerWrapper> r0 = r7.LLILZ
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r8, r0)
            com.ss.android.ugc.aweme.sticker.StickerWrapper r2 = (com.ss.android.ugc.aweme.sticker.StickerWrapper) r2
            if (r2 == 0) goto L64
            kotlin.jvm.internal.AwS163S0101000_25 r1 = new kotlin.jvm.internal.AwS163S0101000_25
            r0 = 4
            r1.<init>(r8, r7, r0)
            X.C01TT.LIZLLL(r1)
            X.0tE5 r0 = r7.LLILLL
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r2.mEffect
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.base.ImageUrlModel, kotlin.Unit> r3 = r0.LJ
            com.ss.android.ugc.effectmanager.common.model.UrlModel r0 = r4.getIconUrl()
            r6 = 0
            if (r0 != 0) goto L67
            r2 = r6
        L21:
            r3.invoke(r2)
            X.0tE5 r0 = r7.LLILLL
            X.0sYr<com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit> r5 = r0.LJFF
            com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean r0 = X.C542790LQn.LIZIZ(r4)
            if (r0 == 0) goto L34
            int r0 = r0.changeDirectionMode
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L34:
            r3 = 0
            if (r6 == 0) goto L65
            int r0 = r6.intValue()
            r1 = 1
            if (r0 == r1) goto L45
            int r0 = r6.intValue()
            r1 = 2
            if (r0 != r1) goto L65
        L45:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.List r0 = r4.getTypes()
            if (r0 == 0) goto L59
            java.util.List r1 = r4.getTypes()
            java.lang.String r0 = "TouchGes"
            boolean r3 = r1.contains(r0)
        L59:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r5.invoke(r4, r2, r1, r0)
        L64:
            return
        L65:
            r1 = 0
            goto L45
        L67:
            com.ss.android.ugc.aweme.base.ImageUrlModel r2 = new com.ss.android.ugc.aweme.base.ImageUrlModel
            java.lang.String r1 = r0.getUri()
            java.util.List r0 = r0.getUrlList()
            r2.<init>(r1, r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1657180tE4.LLLFZ(int):void");
    }

    @Override // X.InterfaceC1657310tEH
    public final void LLJJJJ(int i, boolean z) {
        String str;
        StickerWrapper stickerWrapper = (StickerWrapper) C13LP.LJJJLZIJ(i, this.LLILZ);
        if (stickerWrapper != null) {
            if (z) {
                DuetLayoutBean duetLayoutBeanLIZIZ = C542790LQn.LIZIZ(stickerWrapper.mEffect);
                if (duetLayoutBeanLIZIZ == null || (str = duetLayoutBeanLIZIZ.name) == null) {
                    str = "";
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", this.LL.getCreationId());
                c0lab.LJ("shoot_way", this.LL.shootWay);
                c0lab.LJ("enter_from", "video_shoot_page");
                c0lab.LJ("to_status", str);
                C20684815ws.LJIILLIIL("select_duet_layout", c0lab.LIZ);
            }
            this.LL.isDuetGreenSrceen = C1624570sNT.LJJIII(stickerWrapper.mEffect, "green_screen");
            this.LLILLL.LJIIJ.invoke(stickerWrapper.mEffect);
            LLLFZ(i);
        }
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLI, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C1657330tEJ c1657330tEJ, int i) {
        boolean z;
        UrlModel iconUrl;
        List<String> urlList;
        String str;
        StickerWrapper stickerWrapper = (StickerWrapper) C13LP.LJJJLZIJ(i, this.LLILZ);
        if (stickerWrapper != null) {
            int i2 = 1;
            if (i == this.LLILZIL) {
                z = true;
            } else {
                z = false;
            }
            c1657330tEJ.LLILZIL = stickerWrapper;
            Effect effect = stickerWrapper.mEffect;
            if (effect != null) {
                InterfaceC1635410sex interfaceC1635410sex = c1657330tEJ.LLILLJJLI;
                if (interfaceC1635410sex == null || !C1629180sUu.LIZ(effect, interfaceC1635410sex)) {
                    i2 = 3;
                }
                stickerWrapper.mState = i2;
                c1657330tEJ.I5(stickerWrapper);
                Effect effect2 = stickerWrapper.mEffect;
                if (effect2 != null && (iconUrl = effect2.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) ListProtector.get(urlList, 0)) != null) {
                    c1657330tEJ.LLILZ.LJ(str);
                }
                c1657330tEJ.LLILZ.LJFF(false);
                c1657330tEJ.LLILZ.setText(stickerWrapper.mEffect.getName());
                if (z) {
                    c1657330tEJ.L5(false);
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1657330tEJ c1657330tEJ = new C1657330tEJ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.u0, viewGroup, false), this.LLILLJJLI, this);
        try {
            View view = c1657330tEJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1657330tEJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1657330tEJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1657330tEJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1657330tEJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1657330tEJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1657330tEJ.class.getName();
        return c1657330tEJ;
    }

    public C1657180tE4(ShortVideoContext shortVideoContext, InterfaceC1635410sex interfaceC1635410sex, C1657190tE5 c1657190tE5) {
        this.LL = shortVideoContext;
        this.LLILLJJLI = interfaceC1635410sex;
        this.LLILLL = c1657190tE5;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C1657330tEJ c1657330tEJ = (C1657330tEJ) viewHolder;
        if (list.isEmpty()) {
            onBindViewHolder(c1657330tEJ, i);
        } else {
            c1657330tEJ.LLILZ.LJFF(((Boolean) ListProtector.get(list, 0)).booleanValue());
        }
    }
}
