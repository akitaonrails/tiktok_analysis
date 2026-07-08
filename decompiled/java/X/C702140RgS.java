package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702140RgS extends C09AY implements Function1<Object, Object> {
    public final /* synthetic */ Function1<Object, Object>[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C702140RgS(Function1<Object, Object>[] function1Arr) {
        super(1);
        this.LL = function1Arr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1<Object, Object>[] function1Arr = this.LL;
        for (int length = function1Arr.length - 1; length >= 0; length--) {
            obj = function1Arr[length].invoke(obj);
        }
        return obj;
    }
}
