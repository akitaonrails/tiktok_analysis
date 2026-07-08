package X;

import Y.ALAdapterS13S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.model.GalleryEntranceDisplayText;
import com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse;
import com.bytedance.android.livesdk.livesetting.privilege.LiveProfileCardGiftVaultEntranceCreatorLevel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0fqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143030fqn extends AbstractC495800JcQ<GiftGalleryEntranceResponse.Data> {
    public final DataChannel LLILZIL;
    public LinearLayout LLILZLL;
    public C1324720kZq LLIZ;
    public C16F5 LLIZLLLIL;
    public TextView LLJ;
    public C1324720kZq LLJI;
    public C1324720kZq LLJIJIL;
    public C1143100fqu LLJILJIL;
    public C1143100fqu LLJILJILJ;
    public C1295960jpS LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public Context LLJJIII;
    public C1143090fqt LLJJIJI;
    public View LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public ViewGroup LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public C1324720kZq LLJJJJJIL;
    public Animator LLJJJJLIIL;
    public Animator LLJJL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;
    public C20742216Eq LLJL;
    public LinearLayout LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public String LLJLLL;
    public boolean LLJZ;
    public final EnumC495780JcO LLJZIJLIL;
    public final ValueAnimator LLL;
    public final ALAdapterS13S0100000_17 LLLF;
    public final int[] LLLFF;
    public boolean LLLFFI;
    public final String LLLFZ;
    public final String LLLI;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLLII;
    public final boolean LLLIIII;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.gzt;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        ViewGroup viewGroup;
        this.LLJJIII = this.LL.LIZ;
        View view = this.LLILLL;
        this.LLJ = view != null ? (TextView) view.findViewById(R.id.zn1) : null;
        View view2 = this.LLILLL;
        this.LLJI = view2 != null ? (C1324720kZq) view2.findViewById(R.id.lhq) : null;
        View view3 = this.LLILLL;
        this.LLJIJIL = view3 != null ? (C1324720kZq) view3.findViewById(R.id.lhs) : null;
        View view4 = this.LLILLL;
        this.LLJILJIL = view4 != null ? (C1143100fqu) view4.findViewById(R.id.lhr) : null;
        View view5 = this.LLILLL;
        this.LLJILJILJ = view5 != null ? (C1143100fqu) view5.findViewById(R.id.lht) : null;
        View view6 = this.LLILLL;
        this.LLJILLL = view6 != null ? (C1295960jpS) view6.findViewById(R.id.ixe) : null;
        View view7 = this.LLILLL;
        this.LLJJ = view7 != null ? view7.findViewById(R.id.iph) : null;
        View view8 = this.LLILLL;
        C1143090fqt c1143090fqt = view8 != null ? (C1143090fqt) view8.findViewById(R.id.u36) : null;
        this.LLJJIJI = c1143090fqt;
        if (c1143090fqt != null) {
            c1143090fqt.setTextColor(-10059521);
        }
        View view9 = this.LLILLL;
        this.LLJJIJIIJIL = view9 != null ? view9.findViewById(R.id.u37) : null;
        View view10 = this.LLILLL;
        ViewGroup viewGroup2 = view10 != null ? (ViewGroup) view10.findViewById(R.id.jbc) : null;
        this.LLJJIJIL = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        ViewGroup viewGroup3 = this.LLJJIJIL;
        ViewParent parent = viewGroup3 != null ? viewGroup3.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(false);
        }
        View view11 = this.LLILLL;
        this.LLJJI = view11 != null ? view11.findViewById(R.id.lhw) : null;
        View view12 = this.LLILLL;
        this.LLJJJIL = view12 != null ? view12.findViewById(R.id.lhx) : null;
        View view13 = this.LLILLL;
        this.LLJJJJ = view13 != null ? view13.findViewById(R.id.de6) : null;
        View view14 = this.LLILLL;
        this.LLILZLL = view14 != null ? (LinearLayout) view14.findViewById(R.id.bpo) : null;
        View view15 = this.LLILLL;
        this.LLIZ = view15 != null ? (C1324720kZq) view15.findViewById(R.id.bps) : null;
        View view16 = this.LLILLL;
        this.LLIZLLLIL = view16 != null ? (C16F5) view16.findViewById(R.id.bpz) : null;
        View view17 = this.LLILLL;
        this.LLJJJJJIL = view17 != null ? (C1324720kZq) view17.findViewById(R.id.lhu) : null;
        View view18 = this.LLILLL;
        this.LLJL = view18 != null ? (C20742216Eq) view18.findViewById(R.id.vyk) : null;
        View view19 = this.LLILLL;
        this.LLJLIL = view19 != null ? (LinearLayout) view19.findViewById(R.id.ax9) : null;
        View view20 = this.LLILLL;
        this.LLJLILLLLZIIL = view20 != null ? (C16F5) view20.findViewById(R.id.ax_) : null;
        View view21 = this.LLILLL;
        this.LLJJJ = view21 != null ? (ViewGroup) view21.findViewById(R.id.zn0) : null;
    }

    public final boolean LJIL() {
        return this.LL.LJFF.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId();
    }

    public final boolean LJJ() {
        return this.LLJZ && C1533950q1J.LJ(this.LLJLLL);
    }

    public final boolean LJJI() {
        if (this.LLJLLIL && C1091370eVT.LIZ()) {
            return C13LQ.LJIILLIIL(this.LLJLLL, LiveProfileCardGiftVaultEntranceCreatorLevel.INSTANCE.getValue());
        }
        return false;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
        C1295960jpS c1295960jpS = this.LLJILLL;
        if (c1295960jpS != null && c1295960jpS.isAnimating()) {
            c1295960jpS.cancelAnimation();
        }
        Animator animator = this.LLJJJJLIIL;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        Animator animator2 = this.LLJJL;
        if (animator2 != null && animator2.isRunning()) {
            animator2.cancel();
        }
        AnimatorSet animatorSet = this.LLJJLIIIJLLLLLLLZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        this.LLL.removeAllListeners();
        this.LLL.removeAllUpdateListeners();
        C1143100fqu c1143100fqu = this.LLJILJIL;
        if (c1143100fqu != null) {
            c1143100fqu.LJFF();
        }
        C1143100fqu c1143100fqu2 = this.LLJILJILJ;
        if (c1143100fqu2 != null) {
            c1143100fqu2.LJFF();
        }
        C1295960jpS c1295960jpS2 = this.LLJILLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS3 = this.LLJILLL;
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(4, c1295960jpS3);
        }
        C1324720kZq c1324720kZq = this.LLJJJJJIL;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
        View view = this.LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C20742216Eq c20742216Eq = this.LLJL;
        if (c20742216Eq != null) {
            c20742216Eq.setGuidelineBegin(0);
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C786410Ut5.T4(view3, 1.0f);
        }
        this.LLLFFI = false;
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLJZIJLIL;
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        return this.LLLIIII;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLLII;
    }

    public C1143030fqn(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLILZIL = c495920Jcc.LJIIJJI;
        this.LLJLLL = "";
        this.LLJZIJLIL = EnumC495780JcO.GIFT_GALLERY;
        this.LLL = ObjectAnimator.ofFloat(0.0f, 1.0f);
        this.LLLF = new ALAdapterS13S0100000_17(this, 3);
        this.LLLFF = new int[]{-4623361, -7703809, -9204993};
        this.LLLFZ = "\u2068";
        this.LLLI = "\u2069";
        this.LLLII = new Pair<>(Boolean.TRUE, Collections.singletonList(EnumC496240Jd8.GIFT_GALLERY_ENTRANCE));
        this.LLLIIII = c495920Jcc.LJ;
    }

    public final int LJIJJ(GalleryEntranceDisplayText galleryEntranceDisplayText) {
        if ((LJJI() || LJJ()) && galleryEntranceDisplayText != null) {
            try {
                return Color.parseColor((String) C13LP.LJJLIIIJJI(galleryEntranceDisplayText.textColor));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        return -10059521;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[Catch: all -> 0x0043, PHI: r1
      0x0023: PHI (r1v4 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:8:0x0021, B:6:0x001e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:2:0x0000, B:5:0x001c, B:9:0x0023, B:12:0x0028, B:14:0x003a, B:15:0x003c), top: B:21:0x0000 }] */
    @Override // X.AbstractC495790JcP
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse.Data LJIILIIL(webcast.api.room.GetRoomProfileCardResponse.ResponseData r8) {
        /*
            r7 = this;
            com.google.gson.Gson r2 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L43
            webcast.api.room.GiftGalleryEntrance r0 = r8.giftGalleryEntrance     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r2.LJIILL(r0)     // Catch: java.lang.Throwable -> L43
            java.lang.Class<com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data> r0 = com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse.Data.class
            java.lang.Object r6 = r2.LJII(r1, r0)     // Catch: java.lang.Throwable -> L43
            com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data r6 = (com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse.Data) r6     // Catch: java.lang.Throwable -> L43
            X.0fSt r5 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()     // Catch: java.lang.Throwable -> L43
            X.0Jci r0 = r7.LL     // Catch: java.lang.Throwable -> L43
            long r2 = r0.LJII     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = ""
            if (r6 == 0) goto L20
            java.lang.String r1 = r6.anchorRankingLeague     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L23
        L20:
            r1 = r4
            if (r6 == 0) goto L28
        L23:
            java.lang.String r0 = r6.galleryRankingLeague     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L28
            r4 = r0
        L28:
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L43
            r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L43
            r5.updateGalleryInfoMap(r2, r0)     // Catch: java.lang.Throwable -> L43
            X.0fSt r3 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()     // Catch: java.lang.Throwable -> L43
            X.0Jci r0 = r7.LL     // Catch: java.lang.Throwable -> L43
            long r1 = r0.LJII     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L40
            boolean r0 = r6.allSponsored     // Catch: java.lang.Throwable -> L43
        L3c:
            r3.updateGalleryAllSponsored(r1, r0)     // Catch: java.lang.Throwable -> L43
            goto L42
        L40:
            r0 = 0
            goto L3c
        L42:
            return r6
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143030fqn.LJIILIIL(webcast.api.room.GetRoomProfileCardResponse$ResponseData):com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse.ResponseData r16, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse.Data> r17) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143030fqn.LJIILJJIL(webcast.api.room.GetRoomProfileCardResponse$ResponseData, X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super GiftGalleryEntranceResponse.Data> interfaceC1364105Vn) {
        return LJIILIIL(responseData);
    }

    public final void LJIIZILJ(TextView textView, List<String> list) {
        try {
            if (list.isEmpty()) {
                return;
            }
            if (list.size() == 1) {
                textView.setTextColor(Color.parseColor((String) C13LP.LJJJJZI(list)));
                return;
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(Color.parseColor(it2.next())));
            }
            LJIJ(textView, C13LP.LLII(arrayList));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIJ(textView, this.LLLFF);
        }
    }

    public final void LJIJ(TextView textView, int[] iArr) {
        int[] iArrLLII;
        List listLJJZZIII;
        textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().length(), new Rect());
        if (LJJI() && textView.getLayoutDirection() == 1) {
            if (iArr.length == 0) {
                listLJJZZIII = C13BV.INSTANCE;
            } else {
                listLJJZZIII = C13LQ.LJJZZIII(iArr);
                Collections.reverse(listLJJZZIII);
            }
            iArrLLII = C13LP.LLII(listLJJZZIII);
        } else {
            iArrLLII = iArr;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, r2.width(), r2.height(), iArrLLII, (float[]) null, Shader.TileMode.CLAMP);
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setShader(linearGradient);
        }
        textView.setTextColor(C13LQ.LJIJJLI(iArr));
    }

    public final boolean LJIJJLI(long j, long j2) {
        if (!LJIL() || UserService.getInstance().user().getCurrentUserId() != this.LL.LJII) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append('_');
        sbLIZ.append(j2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0JT6<List<String>> c0jt6 = InterfaceC1106030et7.I6;
        List<String> listLIZ = c0jt6.LIZ();
        if (listLIZ == null) {
            listLIZ = C13BV.INSTANCE;
        }
        boolean z = !listLIZ.contains(strLIZIZ);
        if (z) {
            List<String> listLIZ2 = c0jt6.LIZ();
            if (listLIZ2 == null) {
                listLIZ2 = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listLIZ2);
            if (listLIZ2.size() >= 100) {
                arrayList.addAll(C13LP.LLD(50, listLIZ2));
            } else {
                arrayList.addAll(listLIZ2);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(j);
            sbLIZ2.append('_');
            sbLIZ2.append(j2);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
            c0jt6.LIZJ(arrayList);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0756 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v325 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.16F5, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data$AllLitBadge] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data$TagInfo] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC495790JcP
    /* JADX INFO: renamed from: LJJIFFI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.android.live.base.model.user.User r20, com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse.Data r21) {
        /*
            Method dump skipped, instruction units count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143030fqn.LJIIIZ(com.bytedance.android.live.base.model.user.User, com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(final long r13, com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse.Data r15) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143030fqn.LJJIII(long, com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse$Data):void");
    }

    public static GradientDrawable LJIJI(int i, float f, int i2, int[] iArr) throws Exception {
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (iArr.length == 1) {
            gradientDrawable.setColor(C13LQ.LJIJJLI(iArr));
        } else if (iArr.length > 1) {
            gradientDrawable.setColors(iArr);
            if (C497740JfY.LJJ()) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation);
        } else {
            throw new Exception("Invalid color list");
        }
        if (f > 0.0f) {
            gradientDrawable.setCornerRadius(f);
        }
        gradientDrawable.setShape(0);
        if (i2 > 0) {
            gradientDrawable.setStroke(i2, i);
        }
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    @Override // X.AbstractC495790JcP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.android.live.base.model.user.User r8, com.bytedance.android.live.base.model.user.User r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143030fqn.LJIIL(com.bytedance.android.live.base.model.user.User, com.bytedance.android.live.base.model.user.User, java.lang.Object, java.lang.Object):void");
    }
}
