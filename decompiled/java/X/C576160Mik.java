package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576160Mik extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC576180Mim<R> LL;
    public final /* synthetic */ Field LLILLJJLI;
    public final /* synthetic */ Set<?> LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX INFO: Incorrect field signature: TR; */
    public final /* synthetic */ Annotation LLILZIL;
    public final /* synthetic */ List<Pair<String, String>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/0Mim<TR;>;Ljava/lang/reflect/Field;Ljava/util/Set<*>;Ljava/lang/Object;TR;Ljava/util/List<Lkotlin/Pair<Ljava/lang/String;Ljava/lang/String;>;>;)V */
    public C576160Mik(InterfaceC576180Mim interfaceC576180Mim, Field field, Set set, Object obj, Annotation annotation, List list) {
        super(0);
        this.LL = interfaceC576180Mim;
        this.LLILLJJLI = field;
        this.LLILLL = set;
        this.LLILZ = obj;
        this.LLILZIL = annotation;
        this.LLILZLL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC576180Mim<R> interfaceC576180Mim = this.LL;
        Field field = this.LLILLJJLI;
        String str = (String) this.LLILZ;
        Annotation annotation = this.LLILZIL;
        if (annotation != null) {
            interfaceC576180Mim.LIZ(field, str, annotation, this.LLILZLL);
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
