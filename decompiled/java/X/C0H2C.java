package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.supplementalinfocomponent.model.AnoleSupplementalInfoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.supplementalinfocomponent.AnoleSupplementalInfoComponentInitExtKt$setText$1$1$onCompleted$1", f = "AnoleSupplementalInfoComponentInitExt.kt", l = {}, m = "invokeSuspend")
public final class C0H2C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C1003370cDX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2C(Bitmap bitmap, C1003370cDX c1003370cDX, InterfaceC1364105Vn<? super C0H2C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c1003370cDX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H2C(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("AnoleSupplementalInfoComponentInitExtKt@c9e5.setText$1$1$onCompleted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        if (bitmap != null && !bitmap.isRecycled()) {
            C1003370cDX c1003370cDX = this.LLILLJJLI;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(c1003370cDX.LLILZ.getResources(), this.LL);
            bitmapDrawable.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ = c1003370cDX.LJJ();
            if (anoleSupplementalInfoDataLJJ == null || (str2 = anoleSupplementalInfoDataLJJ.title) == null) {
                str2 = "";
            }
            sbLIZ.append(str2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            C419890GdH c419890GdH = new C419890GdH(bitmapDrawable, 2);
            c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C426750GoL.LIZLLL(c1003370cDX.LLILZ));
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 17);
            TuxTextView tuxTextView = c1003370cDX.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
            }
        } else {
            C1003370cDX c1003370cDX2 = this.LLILLJJLI;
            TuxTextView tuxTextView2 = c1003370cDX2.LLJLILLLLZIIL;
            if (tuxTextView2 != null) {
                AnoleSupplementalInfoData anoleSupplementalInfoDataLJJ2 = c1003370cDX2.LJJ();
                if (anoleSupplementalInfoDataLJJ2 != null) {
                    str = anoleSupplementalInfoDataLJJ2.title;
                } else {
                    str = null;
                }
                tuxTextView2.setText(str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnoleSupplementalInfoComponentInitExtKt@c9e5.setText$1$1$onCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
