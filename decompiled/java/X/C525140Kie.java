package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525140Kie extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ Boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ List<TikTokMediaModel> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C525140Kie(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, List<? extends TikTokMediaModel> list) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
        this.LLILZ = bool2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        C0LAB c0lab2 = c0lab;
        if (this.LL.length() > 0) {
            c0lab2.LJ("pick_id", this.LL);
        }
        c0lab2.LJ("aipick_enter_from", this.LLILLJJLI);
        Boolean bool = this.LLILLL;
        if (bool != null) {
            c0lab2.LIZ(bool.booleanValue() ? 1 : 0, "is_first_try");
        }
        Boolean bool2 = this.LLILZ;
        if (bool2 != null) {
            c0lab2.LIZ(bool2.booleanValue() ? 1 : 0, "is_repick");
        }
        String str = this.LLILZIL;
        if (str != null) {
            c0lab2.LJ("pick_type", str);
        }
        String str2 = this.LLILZLL;
        if (str2 != null) {
            c0lab2.LJ("pick_theme", str2);
        }
        c0lab2.LIZ(this.LLIZ.size(), "pick_material_cnt");
        return Unit.LIZ;
    }
}
