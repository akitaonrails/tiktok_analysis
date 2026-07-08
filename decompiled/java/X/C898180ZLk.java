package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898180ZLk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ AttachmentComponent LLJ;
    public final /* synthetic */ Serializable LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL = false;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ View LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898180ZLk(Context context, View view, AttachmentComponent attachmentComponent, Serializable serializable, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, Function0 function0) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = context;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = function0;
        this.LLIZLLLIL = map;
        this.LLJ = attachmentComponent;
        this.LLJI = serializable;
        this.LLJIJIL = num;
        this.LLJILJILJ = str6;
        this.LLJILLL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LightInteractionManager lightInteractionManager = LightInteractionManager.LLJILLL;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C898140ZLg(this.LL, this.LLILZIL, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, lightInteractionManager.LJII(this.LL), this.LLILLJJLI, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, null), 3);
        lightInteractionManager.LJIILLIIL(this.LLILLJJLI);
        C898190ZLl c898190ZLl = C898190ZLl.LL;
        String str = this.LLILLL;
        String str2 = this.LL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        c898190ZLl.getClass();
        if (C898190ZLl.LIZLLL()) {
            ((Set) C898190ZLl.LLILLL.getValue()).add(C898190ZLl.LIZ(str, str2, str3, str4, str5));
        }
        Function0<Unit> function0 = this.LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
