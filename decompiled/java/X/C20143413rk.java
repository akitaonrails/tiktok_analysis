package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20143413rk extends C09AY implements Function1<String, C20143613rm> {
    public C20143413rk() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C20143613rm invoke(String str) {
        return new C20143613rm(new ReentrantReadWriteLock(), new AtomicInteger(0));
    }
}
