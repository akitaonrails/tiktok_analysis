package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C570680MZu extends C2217421BqW implements Function1<C570700MZw, Boolean> {
    public static final C570680MZu LL = new C570680MZu();

    public C570680MZu() {
        super(1, C570700MZw.class, "isDirectPublishFromValid", "isDirectPublishFromValid()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C570700MZw c570700MZw) {
        return Boolean.valueOf(C570690MZv.LIZJ.contains(Integer.valueOf(c570700MZw.LIZLLL)));
    }
}
