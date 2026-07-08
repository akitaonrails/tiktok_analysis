package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HHY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHY {
    public final String LIZ;
    public final Context LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1573));
    public final List<AnonymousClass0957<Object>> LJII = new ArrayList();
    public final ConcurrentHashMap<C0HHW, File> LJIIIIZZ = new ConcurrentHashMap<>();
    public final C438440HHe LJIIIZ = new InterfaceC438470HHh() { // from class: X.0HHe
        @Override // X.InterfaceC438470HHh
        public final void LIZ() {
        }

        @Override // X.InterfaceC438470HHh
        public final void LLJJIJIL() {
            this.LIZ.LJIIIIZZ.clear();
            Iterator it2 = ((ArrayList) this.LIZ.LJII).iterator();
            while (it2.hasNext()) {
                ((C09AE) it2.next()).LIZIZ(null);
            }
        }
    };

    public final C0HFS LJI() {
        return (C0HFS) this.LJI.getValue();
    }

    public static Bitmap LJ(View view) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C842150X1x.LIZIZ(canvas, view);
        canvas.drawBitmap(bitmapCreateBitmap, new Matrix(), paint);
        return bitmapCreateBitmap;
    }

    public final C0VSJ LIZLLL(File file) throws Exception {
        String absolutePath;
        int iLIZIZ;
        int iLIZIZ2;
        int iValueOf;
        int iValueOf2;
        C0VSJ c0vsjLJ = C2354809Ko.LJ();
        if (c0vsjLJ != null) {
            if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath);
                if (bitmapDecodeFile != null) {
                    int iLJIIJ = C12ES.LJIIJ(this.LIZIZ);
                    int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LIZIZ);
                    float f = iLJIIJ;
                    if (f > C12ES.LIZJ(600.0f, this.LIZIZ)) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(376));
                    } else if (iLJIIIIZZ <= C12ES.LIZJ(667.0f, this.LIZIZ)) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(256));
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(326));
                    }
                    if (f > C12ES.LIZJ(600.0f, this.LIZIZ)) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(469.42d)));
                    } else if (iLJIIIIZZ <= C12ES.LIZJ(667.0f, this.LIZIZ)) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(319.61d)));
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(407));
                    }
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, iLIZIZ, iLIZIZ2, true);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    AttributeSet attributeSet = null;
                    canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.save();
                    TuxIconView tuxIconView = new TuxIconView(this.LIZIZ, null, 0, 6, null);
                    tuxIconView.setIconRes(R.raw.icon_tiktok_text_logo);
                    tuxIconView.setTintColor(LJI().LJ.LIZ);
                    C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(-2, -2));
                    tuxIconView.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), 1073741824), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), 1073741824));
                    int i = 0;
                    tuxIconView.layout(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                    if (C426750GoL.LIZLLL(this.LIZIZ)) {
                        iValueOf = Integer.valueOf((C12ES.LJIILJJIL(bitmapCreateScaledBitmap.getWidth(), this.LIZIZ) - 18) - C12ES.LJIILJJIL(tuxIconView.getMeasuredWidth(), this.LIZIZ));
                    } else {
                        iValueOf = 18;
                    }
                    canvas.drawBitmap(LJ(tuxIconView), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((C12ES.LJIILJJIL(bitmapCreateScaledBitmap.getHeight(), this.LIZIZ) - 20) - C12ES.LJIILJJIL(tuxIconView.getMeasuredHeight(), this.LIZIZ)))), (Paint) null);
                    canvas.save();
                    TuxTextView tuxTextView = new TuxTextView(this.LIZIZ, attributeSet, 6, i);
                    tuxTextView.setTextColor(LJI().LJ.LIZ);
                    tuxTextView.setTuxFont(33);
                    tuxTextView.setText(tuxTextView.getContext().getString(2131827091));
                    C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
                    tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 0), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), 0));
                    tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                    if (C426750GoL.LIZLLL(this.LIZIZ)) {
                        iValueOf2 = 18;
                    } else {
                        iValueOf2 = Integer.valueOf((C12ES.LJIILJJIL(bitmapCreateScaledBitmap.getWidth(), this.LIZIZ) - 18) - C12ES.LJIILJJIL(tuxTextView.getMeasuredWidth(), this.LIZIZ));
                    }
                    canvas.drawBitmap(LJ(tuxTextView), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(iValueOf2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((C12ES.LJIILJJIL(bitmapCreateScaledBitmap.getHeight(), this.LIZIZ) - 16) - C12ES.LJIILJJIL(tuxTextView.getMeasuredHeight(), this.LIZIZ)))), (Paint) null);
                    canvas.save();
                    C0VSJ c0vsj = new C0VSJ(c0vsjLJ.getAbsolutePath(), "processed_mask_background.png");
                    C0VSV c0vsv = new C0VSV(c0vsj.getAbsoluteFile());
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                    c0vsv.flush();
                    c0vsv.close();
                    return c0vsj;
                }
                throw new Exception("The decoded bitmap for original card is null");
            }
            throw new Exception("The original card file is null");
        }
        throw new Exception("The downlaod temp folder is null");
    }

    public final File LJFF(C0HHW c0hhw) throws C0HFH {
        File file = this.LJIIIIZZ.get(c0hhw);
        if (file != null) {
            return file;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The resource type ");
        sbLIZ.append(c0hhw);
        sbLIZ.append(" not stored");
        throw new C0HFH(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HHY.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0VSJ LIZJ(java.io.File r27, java.lang.String r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HHY.LIZJ(java.io.File, java.lang.String):X.0VSJ");
    }

    public static Object LIZ(final C438460HHg c438460HHg, final InterfaceC438470HHh interfaceC438470HHh, C438420HHc c438420HHc) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c438420HHc));
        c2252611DEt.LJIJJ();
        final String str = c438460HHg.LIZJ;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            new C0HDR("The url provided is null!");
            interfaceC438470HHh.LLJJIJIL();
            C189200o6.m2constructorimpl(null);
            c2252611DEt.resumeWith(null);
        } else {
            C1331660kl2.LJIIIZ(str).LJIILJJIL(new InterfaceC605070NoH(c438460HHg, str, c2252611DEt) { // from class: X.0HHb
                public final /* synthetic */ String LIZIZ;
                public final /* synthetic */ InterfaceC20236714Gf<File> LIZJ;

                @Override // X.InterfaceC605070NoH
                public final void onCanceled() {
                    InterfaceC438470HHh interfaceC438470HHh2 = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Downloaded image cancelled: ");
                    sbLIZ.append(this.LIZIZ);
                    new C0HDR(C2188811AlT.LIZIZ(sbLIZ));
                    interfaceC438470HHh2.LLJJIJIL();
                    InterfaceC20236714Gf<File> interfaceC20236714Gf = this.LIZJ;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }

                @Override // X.InterfaceC605070NoH
                public final void LIZ(File file) {
                    if (file == null) {
                        InterfaceC438470HHh interfaceC438470HHh2 = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Downloaded image is null: ");
                        sbLIZ.append(this.LIZIZ);
                        new C0HDR(C2188811AlT.LIZIZ(sbLIZ));
                        interfaceC438470HHh2.LLJJIJIL();
                        InterfaceC20236714Gf<File> interfaceC20236714Gf = this.LIZJ;
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                        return;
                    }
                    this.LIZ.LIZ();
                    InterfaceC20236714Gf<File> interfaceC20236714Gf2 = this.LIZJ;
                    C189200o6.m2constructorimpl(file);
                    interfaceC20236714Gf2.resumeWith(file);
                }

                @Override // X.InterfaceC605070NoH
                public final void onFailed(Throwable th) {
                    String message;
                    InterfaceC438470HHh interfaceC438470HHh2 = this.LIZ;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    new C0HDR(message);
                    interfaceC438470HHh2.LLJJIJIL();
                    InterfaceC20236714Gf<File> interfaceC20236714Gf = this.LIZJ;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }

                {
                    this.LIZIZ = str;
                    this.LIZJ = c2252611DEt;
                }
            });
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c438420HHc);
        }
        return objLJIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6 A[Catch: Exception -> 0x00f5, TryCatch #0 {Exception -> 0x00f5, blocks: (B:54:0x00d0, B:55:0x00d3, B:58:0x00db, B:61:0x00e9, B:63:0x00f0, B:56:0x00d6, B:57:0x00d9, B:38:0x009d, B:39:0x00a0, B:42:0x00a6, B:43:0x00aa, B:45:0x00b0, B:48:0x00b6, B:51:0x00c3, B:19:0x0046, B:21:0x004a, B:23:0x004e, B:25:0x005d, B:26:0x0060, B:28:0x006c, B:31:0x0076, B:33:0x0082, B:35:0x0088), top: B:68:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: Exception -> 0x00f5, TryCatch #0 {Exception -> 0x00f5, blocks: (B:54:0x00d0, B:55:0x00d3, B:58:0x00db, B:61:0x00e9, B:63:0x00f0, B:56:0x00d6, B:57:0x00d9, B:38:0x009d, B:39:0x00a0, B:42:0x00a6, B:43:0x00aa, B:45:0x00b0, B:48:0x00b6, B:51:0x00c3, B:19:0x0046, B:21:0x004a, B:23:0x004e, B:25:0x005d, B:26:0x0060, B:28:0x006c, B:31:0x0076, B:33:0x0082, B:35:0x0088), top: B:68:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0 A[Catch: Exception -> 0x00f5, TryCatch #0 {Exception -> 0x00f5, blocks: (B:54:0x00d0, B:55:0x00d3, B:58:0x00db, B:61:0x00e9, B:63:0x00f0, B:56:0x00d6, B:57:0x00d9, B:38:0x009d, B:39:0x00a0, B:42:0x00a6, B:43:0x00aa, B:45:0x00b0, B:48:0x00b6, B:51:0x00c3, B:19:0x0046, B:21:0x004a, B:23:0x004e, B:25:0x005d, B:26:0x0060, B:28:0x006c, B:31:0x0076, B:33:0x0082, B:35:0x0088), top: B:68:0x0020 }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0HHY] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0HHe, X.0HHh] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0HHh] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C438460HHg r14, X.C438440HHe r15, X.InterfaceC1364105Vn r16) throws X.C0HFH {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HHY.LJII(X.0HHg, X.0HHe, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0HHe] */
    public C0HHY(C0HFG c0hfg, String str, C19EG c19eg, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = str;
        this.LIZIZ = c19eg;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = c0hfg.LIZ;
        this.LJ = c0hfg.LIZIZ;
        this.LJFF = c0hfg.LIZJ;
    }

    public final Object LIZIZ(final String str, final C438460HHg c438460HHg, final InterfaceC438470HHh interfaceC438470HHh, C438420HHc c438420HHc) throws Exception {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c438420HHc));
        c2252611DEt.LJIJJ();
        if (str.length() == 0) {
            new C0HDR("The url provided is null!");
            interfaceC438470HHh.LLJJIJIL();
            C189200o6.m2constructorimpl(null);
            c2252611DEt.resumeWith(null);
        } else {
            final C0VSJ c0vsjLJ = C2354809Ko.LJ();
            if (c0vsjLJ != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJIJL(this.LIZIZ);
                c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0(c438460HHg, str, c2252611DEt, c0vsjLJ) { // from class: X.0HHa
                    public final /* synthetic */ String LLILLJJLI;
                    public final /* synthetic */ InterfaceC20236714Gf<File> LLILLL;
                    public final /* synthetic */ File LLILZ;
                    public final /* synthetic */ String LLILZIL = "processed_avatar_background.png";

                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) throws Throwable {
                        if (bitmap == null) {
                            InterfaceC438470HHh interfaceC438470HHh2 = this.LL;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Downloaded image is null: ");
                            sbLIZ.append(this.LLILLJJLI);
                            new C0HDR(C2188811AlT.LIZIZ(sbLIZ));
                            interfaceC438470HHh2.LLJJIJIL();
                            InterfaceC20236714Gf<File> interfaceC20236714Gf = this.LLILLL;
                            C189200o6.m2constructorimpl(null);
                            interfaceC20236714Gf.resumeWith(null);
                            return;
                        }
                        C0VSJ c0vsj = new C0VSJ(this.LLILZ.getAbsolutePath(), this.LLILZIL);
                        C1319770kRr.LJ(100, Bitmap.CompressFormat.PNG, bitmap, c0vsj);
                        this.LL.LIZ();
                        InterfaceC20236714Gf<File> interfaceC20236714Gf2 = this.LLILLL;
                        C189200o6.m2constructorimpl(c0vsj);
                        interfaceC20236714Gf2.resumeWith(c0vsj);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        InterfaceC438470HHh interfaceC438470HHh2 = this.LL;
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        new C0HDR(message);
                        interfaceC438470HHh2.LLJJIJIL();
                        InterfaceC20236714Gf<File> interfaceC20236714Gf = this.LLILLL;
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                    }

                    {
                        this.LLILLJJLI = str;
                        this.LLILLL = c2252611DEt;
                        this.LLILZ = c0vsjLJ;
                    }
                });
            } else {
                throw new Exception("The download temp folder is null");
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c438420HHc);
        }
        return objLJIJ;
    }
}
