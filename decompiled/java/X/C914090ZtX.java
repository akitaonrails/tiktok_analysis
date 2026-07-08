package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ZtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914090ZtX implements InterfaceC863600XuI {
    public final int $t;

    public static final void LIZIZ$0(C914090ZtX c914090ZtX, C0YMW c0ymw) {
    }

    public static final void LIZIZ$1(C914090ZtX c914090ZtX, C0YMW c0ymw) {
    }

    public static final void LIZIZ$2(C914090ZtX c914090ZtX, C0YMW c0ymw) {
    }

    public static final void LIZIZ$3(C914090ZtX c914090ZtX, C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
        }
    }

    public C914090ZtX(int i) {
        this.$t = i;
    }

    public static final void onSuccess$3(C914090ZtX c914090ZtX, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null && c0y8t.isGroupChat()) {
            C874150YQz.LIZ.getClass();
            ConcurrentHashMap<String, C0YR4> concurrentHashMap = C874150YQz.LIZIZ;
            C0YR4 c0yr4 = concurrentHashMap.get(c0y8t.getConversationId());
            if (c0yr4 == null) {
                c0yr4 = new C0YR4(3);
            }
            concurrentHashMap.put(c0y8t.getConversationId(), new C0YR4(true, c0yr4.LIZIZ));
        }
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$0(C914090ZtX c914090ZtX, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$1(C914090ZtX c914090ZtX, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$2(C914090ZtX c914090ZtX, Object obj) {
    }
}
