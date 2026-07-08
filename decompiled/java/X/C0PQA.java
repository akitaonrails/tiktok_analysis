package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0PQA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQA {
    public final List<C644110POf> LIZ;

    public final synchronized List<C644110POf> LIZIZ() {
        return Collections.unmodifiableList(this.LIZ);
    }

    public C0PQA() {
        this.LIZ = new ArrayList();
    }

    public C0PQA(List<C644110POf> list) {
        this.LIZ = list;
    }

    public final synchronized C644110POf LIZ(int i) {
        return (C644110POf) ListProtector.get(this.LIZ, i);
    }
}
