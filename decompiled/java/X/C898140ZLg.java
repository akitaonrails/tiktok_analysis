package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionLegacyRelationBtnService$getOnClickHook$2$1", f = "LightInteractionLegacyRelationBtnService.kt", l = {240}, m = "invokeSuspend")
public final class C898140ZLg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ AttachmentComponent LLILZIL;
    public final /* synthetic */ Serializable LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ View LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898140ZLg(String str, String str2, Map<String, String> map, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, String str3, Context context, boolean z, String str4, View view, InterfaceC1364105Vn<? super C898140ZLg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
        this.LLILZIL = attachmentComponent;
        this.LLILZLL = serializable;
        this.LLIZ = num;
        this.LLIZLLLIL = str3;
        this.LLJ = context;
        this.LLJI = z;
        this.LLJIJIL = str4;
        this.LLJILJIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C898140ZLg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionLegacyRelationBtnService@10ef.getOnClickHook$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LightInteractionManager lightInteractionManager = LightInteractionManager.LLJILLL;
            final String str = this.LLILLJJLI;
            final String str2 = this.LLILLL;
            final Context context = this.LLJ;
            final boolean z = this.LLJI;
            final String str3 = this.LLJIJIL;
            final Map<String, String> map = this.LLILZ;
            final View view = this.LLJILJIL;
            C0YTK c0ytk = new C0YTK() { // from class: X.0ZLf
                @Override // X.C0YTY
                public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                }

                @Override // X.C0YTK
                public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTY
                public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                }

                @Override // X.C0YTK
                public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                }

                @Override // X.C0YTK
                public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map2) {
                    C898190ZLl c898190ZLl = C898190ZLl.LL;
                    String str4 = str;
                    String str5 = str2;
                    Context context2 = context;
                    boolean z2 = z;
                    String str6 = str3;
                    if (str6 == null) {
                        str6 = "";
                    }
                    c898190ZLl.LJJJJLL(str4, str5, context2, z2, str6, map, view);
                }
            };
            AttachmentComponent attachmentComponent = this.LLILZIL;
            Serializable serializable = this.LLILZLL;
            Integer num = this.LLIZ;
            this.LL = 1;
            if (lightInteractionManager.LJJLI(str, null, str2, map, null, attachmentComponent, serializable, num, c0ytk, this) == objLJFF) {
                C1C7U.LIZIZ("LightInteractionLegacyRelationBtnService@10ef.getOnClickHook$2$1");
                return objLJFF;
            }
        }
        LightInteractionManager.LLJILLL.LIZJ();
        C898150ZLh.LL.LJFF(this.LLIZLLLIL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LightInteractionLegacyRelationBtnService@10ef.getOnClickHook$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
