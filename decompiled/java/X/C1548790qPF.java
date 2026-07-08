package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qPF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548790qPF extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548790qPF(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = z;
        this.LLIZ = str6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL(Scene.SCENE_SERVICE, this.LL);
        String str = this.LLILLJJLI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("gecko_channel", str);
        c957403oi2.LIZLLL("access_key", this.LLILLL);
        String str3 = this.LLILZ;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("host", str3);
        c957403oi2.LIZLLL("context", this.LLILZIL);
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LLILZLL ? 1 : 0));
        String str4 = this.LLIZ;
        if (str4 != null) {
            str2 = str4;
        }
        c957403oi2.LIZLLL("error_msg", str2);
        return Unit.LIZ;
    }
}
