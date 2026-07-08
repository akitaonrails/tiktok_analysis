package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.celebration.CelebrationPosterInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MPL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MPL extends AbstractC2255721DQs<C0MPT> implements InterfaceC379610EuV, C0MPT {
    public static final C0MPN LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public String LLILZIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), Integer.class, "celebration_type");
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 653));
    public final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
    public final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(570));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0MPN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MPL.class, "celebrationType", "getCelebrationType()I", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MPL.class, "publishModel", "getPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0MPN
        };
        LLJI = 8;
    }

    public C0MPT Z1() {
        return this;
    }

    private final CelebrationPosterInfo H2() {
        return (CelebrationPosterInfo) this.LLILZ.getValue();
    }

    public final VideoPublishEditModel T2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJ[1]);
    }

    @Override // X.C0MPT
    public String qy0() {
        String str = this.LLILZIL;
        return str == null ? "" : str;
    }

    public final int w2() {
        return ((Number) this.LLILLJJLI.getValue(this, LLJ[0])).intValue();
    }

    public final int W2() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final int getHeight() {
        return this.LLIZ;
    }

    public C0MPL(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final Bitmap G2(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public final Pair<Bitmap, Canvas> X1(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.LLILZLL, this.LLIZ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C842150X1x.LIZIZ(canvas, view);
        return new Pair<>(bitmapCreateBitmap, canvas);
    }

    public final void c3(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(this.LLILZLL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLIZ, 1073741824));
        view.layout(0, 0, this.LLILZLL, this.LLIZ);
    }

    public final void v3(View view) {
        String str;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.xzi);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.xzj);
        if (C14LC.LJIIIZ) {
            B3(tuxTextView, 19.0f, 12.0f);
            B3(tuxTextView2, 19.0f, 12.0f);
        } else {
            B3(tuxTextView, 21.0f, 12.0f);
            B3(tuxTextView2, 21.0f, 12.0f);
        }
        CelebrationPosterInfo celebrationPosterInfoH2 = H2();
        String str2 = null;
        if (celebrationPosterInfoH2 != null) {
            str = celebrationPosterInfoH2.caption1;
        } else {
            str = null;
        }
        q3(tuxTextView, str);
        CelebrationPosterInfo celebrationPosterInfoH22 = H2();
        if (celebrationPosterInfoH22 != null) {
            str2 = celebrationPosterInfoH22.caption2;
        }
        q3(tuxTextView2, str2);
        if (tuxTextView.getVisibility() == 0 && tuxTextView2.getVisibility() == 0) {
            if (tuxTextView.getTextSize() > tuxTextView2.getTextSize()) {
                tuxTextView.LJJJJI(C418440Gaw.LJFF(tuxTextView2.getTextSize(), tuxTextView.getContext()));
            } else {
                if (tuxTextView.getTextSize() >= tuxTextView2.getTextSize()) {
                    return;
                }
                tuxTextView2.LJJJJI(C418440Gaw.LJFF(tuxTextView.getTextSize(), tuxTextView.getContext()));
            }
        }
    }

    private final void q3(TuxTextView tuxTextView, String str) {
        if (str != null && str.length() != 0) {
            C337180DJs.LIZJ(tuxTextView);
            tuxTextView.setText(str);
        } else {
            C337180DJs.LIZ(tuxTextView);
        }
    }

    @Override // X.C0MPT
    public void UI2(Context context, Function1<? super String, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05Q5(this, context, function1, null), 3);
    }

    public final Object W1(View view, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        List<String> urlList;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        UrlModel avatarMedium = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarMedium();
        List<String> urlList2 = null;
        if (avatarMedium != null) {
            urlList = avatarMedium.getUrlList();
        } else {
            urlList = null;
        }
        if (urlList != null && !urlList.isEmpty()) {
            if (avatarMedium != null) {
                urlList2 = avatarMedium.getUrlList();
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList2));
            c1331670kl3LJIIJ.LJJIJL(view.getContext());
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJIIJ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIJ.LJJII(new C1766706vx(this, c23260099m, 0));
        } else {
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.raw.icon_color_default_avatar);
            c1331670kl3LJFF.LJJIJL(view.getContext());
            C1331750klB c1331750klB2 = new C1331750klB();
            c1331750klB2.LIZ = true;
            c1331670kl3LJFF.LJJI = new C1331730kl9(c1331750klB2);
            c1331670kl3LJFF.LJJII(new C1766606vw(c23260099m, 0));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void i3(View view, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.bh2);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(appCompatImageView.getContext().getResources(), bitmap);
        appCompatImageView.setImageBitmap(bitmap);
        appCompatImageView.setBackground(bitmapDrawable);
    }

    public final void m3(Effect effect, View view) {
        if (effect == null) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C570490MZb.LIZJ(effect.getUnzipPath()));
            sbLIZ.append("poster.jpg");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C570490MZb.LIZJ(effect.getUnzipPath()));
            sbLIZ2.append("poster.jpeg");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (C2354709Kn.LIZIZ(strLIZIZ)) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getContext().getResources(), BitmapFactory.decodeFile(strLIZIZ));
                bitmapDrawable.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.setBackground(bitmapDrawable);
            } else if (C2354709Kn.LIZIZ(strLIZIZ2)) {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(view.getContext().getResources(), BitmapFactory.decodeFile(strLIZIZ2));
                bitmapDrawable2.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                view.setBackground(bitmapDrawable2);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o2(android.content.Context r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.effectmanager.effect.model.Effect> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C05Q7
            if (r0 == 0) goto L21
            r6 = r10
            X.05Q7 r6 = (X.C05Q7) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L27
            goto L71
        L21:
            X.05Q7 r6 = new X.05Q7
            r6.<init>(r8, r10)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            r6.LL = r9     // Catch: java.lang.Throwable -> L7a
            r6.getClass()     // Catch: java.lang.Throwable -> L7a
            r6.LLILZ = r0     // Catch: java.lang.Throwable -> L7a
            X.099m r4 = new X.099m     // Catch: java.lang.Throwable -> L7a
            X.05Vn r0 = X.C099M.LIZLLL(r6)     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            X.0sex r3 = X.C1633850scR.LIZ(r9, r5)     // Catch: java.lang.Throwable -> L7a
            com.ss.android.ugc.aweme.story.celebration.CelebrationPosterInfo r0 = r8.H2()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L50
            java.lang.String r2 = r0.posterBackgroundEffectId     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L58
        L50:
            X.01GW r0 = X.C2539609xK.LIZ     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L7a
        L58:
            X.06wC r1 = new X.06wC     // Catch: java.lang.Throwable -> L7a
            r0 = 1
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7a
            r3.LJIIZILJ(r2, r5, r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r4.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L7a
            if (r2 != r0) goto L6e
            X.C099Q.LIZJ(r6)     // Catch: java.lang.Throwable -> L7a
        L6e:
            if (r2 != r7) goto L74
            return r7
        L71:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L7a
        L74:
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r2     // Catch: java.lang.Throwable -> L7a
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L7a
            goto L86
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L86:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 != 0) goto L8d
            return r2
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MPL.o2(android.content.Context, X.05Vn):java.lang.Object");
    }

    private final void B3(TuxTextView tuxTextView, float f, float f2) {
        tuxTextView.LJJJJI(f);
        tuxTextView.setMinTextSize(f2);
    }
}
