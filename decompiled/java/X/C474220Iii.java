package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingGeckoDrawableLoadingSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0Iii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.list.viewbinder.SinglePrimaryTopView$loadUserDescriptionImageAsync$1", f = "SinglePrimaryTopView.kt", l = {270}, m = "invokeSuspend")
public final class C474220Iii extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1811280xEc LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474220Iii(String str, C1811280xEc c1811280xEc, InterfaceC1364105Vn<? super C474220Iii> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1811280xEc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C474220Iii c474220Iii = new C474220Iii(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c474220Iii.LLILLJJLI = obj;
        return c474220Iii;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        C1C7U.LIZ("SinglePrimaryTopView@a689.loadUserDescriptionImageAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                spannableStringBuilder = (SpannableStringBuilder) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new C474210Iih(null), 2);
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) C497740JfY.LJIJI(2131856737));
            int iLJJJ = a0.LJJJ(spannableStringBuilder, "{1:string}", 0, false, 6);
            spannableStringBuilder.replace(iLJJJ, iLJJJ + 10, (CharSequence) this.LLILLL);
            this.LLILLJJLI = spannableStringBuilder;
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SinglePrimaryTopView@a689.loadUserDescriptionImageAsync$1");
                return objLJFF;
            }
        }
        Drawable drawable = (Drawable) obj;
        int iLJJJ2 = a0.LJJJ(spannableStringBuilder, "{0:image}", 0, false, 6);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) C497740JfY.LIZIZ(11.0f), (int) C497740JfY.LIZIZ(11.0f));
            C786410Ut5.q2(spannableStringBuilder, new C416760GVu(drawable), iLJJJ2, iLJJJ2 + 9, 33);
        } else if (LiveRankingGeckoDrawableLoadingSetting.INSTANCE.getValue().handleNullDrawableOpt) {
            spannableStringBuilder.replace(iLJJJ2, iLJJJ2 + 9, (CharSequence) "");
        }
        this.LLILZ.getTvUserDescriptionFromXml().setText(spannableStringBuilder);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SinglePrimaryTopView@a689.loadUserDescriptionImageAsync$1");
        return unit;
    }
}
