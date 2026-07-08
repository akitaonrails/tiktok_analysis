package X;

import com.bytedance.ext_power_list.AssemReusedDispatcher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [ITEM, R] */
/* JADX INFO: renamed from: X.0SZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723400SZe<ITEM, R> extends C09AY implements Function0<AssemReusedDispatcher<R, ITEM>> {
    public C723400SZe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AssemReusedDispatcher();
    }
}
