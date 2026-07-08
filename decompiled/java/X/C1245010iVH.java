package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245010iVH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245010iVH(Context context, User user, C259800zU<String> c259800zU, C259800zU<String> c259800zU2, String str, Map<String, String> map) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = user;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = str;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1252240igw c1252240igw = C1252240igw.LIZ;
        Context context = this.LL;
        User user = this.LLILLJJLI;
        String str = this.LLILLL.element;
        String str2 = this.LLILZ.element;
        String str3 = this.LLILZIL;
        Map<String, String> map = this.LLILZLL;
        c1252240igw.getClass();
        C1252240igw.LIZIZ(context, user, str, str2, str3, map);
        return Unit.LIZ;
    }
}
