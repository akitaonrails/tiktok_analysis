package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0M7V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7V implements InterfaceC1370310llN {
    public final String LL;
    public final String LLILLJJLI;
    public AwS565S0100000_21 LLILLL;
    public boolean LLILZ = true;
    public Context LLILZIL;
    public View LLILZLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_download_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_arrow_to_bottom;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return true;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131845926;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "save_image";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        Context context;
        if (!this.LLILZ || (context = this.LLILZIL) == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 33 || C838410Wul.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    public C0M7V(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC1370310llN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.content.Context r14, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r15) {
        /*
            r13 = this;
            r11 = r14
            r13.LLILZIL = r11
            java.lang.String r1 = r13.LLILLJJLI
            java.lang.String r0 = "data"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 0
            r3 = 2
            r6 = 1
            if (r0 == 0) goto L5c
            java.lang.String r0 = r13.LL
            if (r0 == 0) goto L5c
            int r0 = r0.length()
            if (r0 == 0) goto L5c
            java.lang.String r5 = r13.LL
            X.00cf r4 = new X.00cf
            r4.<init>()
            r4.element = r3
            if (r11 == 0) goto L59
            android.app.Activity r3 = X.C1375500ltk.LJII(r11)
            if (r3 == 0) goto L59
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-check_image_save_download_permission"
            com.bytedance.bpea.cert.token.TokenCert r2 = r1.with(r0)
            kotlin.jvm.internal.AwS93S1200000_8 r1 = new kotlin.jvm.internal.AwS93S1200000_8
            r0 = 10
            r1.<init>(r4, r5, r11, r0)
            int r0 = X.C540280LGw.LIZIZ(r3, r2, r1)
        L3e:
            if (r0 != r6) goto La0
            r0 = 2131845928(0x7f116328, float:1.932529E38)
            java.lang.String r2 = r11.getString(r0)
        L47:
            android.app.Activity r1 = X.C2214201BlK.LJFF()
            if (r1 == 0) goto L58
            X.0mGx r0 = new X.0mGx
            r0.<init>(r1)
            r0.LJIIJ(r2)
            r0.LJIIJJI()
        L58:
            return
        L59:
            int r0 = r4.element
            goto L3e
        L5c:
            java.lang.String r1 = r13.LLILLJJLI
            java.lang.String r0 = "custom"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto La0
            kotlin.jvm.internal.AwS565S0100000_21 r0 = r13.LLILLL
            if (r0 == 0) goto L9e
            java.lang.Object r10 = r0.invoke()
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L9e
            r13.LLILZ = r6
            android.view.View r9 = r13.LLILZLL
            X.00cf r8 = new X.00cf
            r8.<init>()
            r8.element = r3
            if (r11 == 0) goto L9b
            android.app.Activity r2 = X.C1375500ltk.LJII(r11)
            if (r2 == 0) goto L9b
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-bpea-share_jsb_save_screen_image_permission"
            com.bytedance.bpea.cert.token.TokenCert r0 = r1.with(r0)
            kotlin.jvm.internal.AwS106S0400000_8 r7 = new kotlin.jvm.internal.AwS106S0400000_8
            r12 = 12
            r7.<init>(r8, r9, r10, r11, r12)
            int r0 = X.C540280LGw.LIZIZ(r2, r0, r7)
        L98:
            if (r0 != r3) goto L3e
            return
        L9b:
            int r0 = r8.element
            goto L98
        L9e:
            r13.LLILZ = r2
        La0:
            boolean r0 = r13.LLILZ
            if (r0 != 0) goto Lac
            r0 = 2131845925(0x7f116325, float:1.9325285E38)
            java.lang.String r2 = r11.getString(r0)
            goto L47
        Lac:
            r0 = 2131845927(0x7f116327, float:1.9325289E38)
            java.lang.String r2 = r11.getString(r0)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M7V.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
        this.LLILZLL = view;
    }
}
