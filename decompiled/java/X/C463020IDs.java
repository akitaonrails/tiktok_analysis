package X;

import com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.QuotedMessageViewModel;
import com.ss.android.ugc.aweme.im.service.impl.AwemeCardManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C463020IDs implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$1(C463020IDs c463020IDs, C0YMW c0ymw) {
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
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
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
        }
    }

    public C463020IDs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C463020IDs c463020IDs, C0YMW c0ymw) {
        AwemeCardManager awemeCardManager = AwemeCardManager.LIZIZ;
        List listSingletonList = Collections.singletonList((C869590Y9l) c463020IDs.l0);
        awemeCardManager.getClass();
        AwemeCardManager.LJII(null, listSingletonList);
    }

    public static final void LIZIZ$2(C463020IDs c463020IDs, C0YMW c0ymw) {
        Throwable throwable;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fetch from server failed ");
        if (c0ymw != null) {
            throwable = c0ymw.getThrowable();
        } else {
            throwable = null;
        }
        sbLIZ.append(throwable);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onSuccess$0(C463020IDs c463020IDs, Object obj) {
        AwemeCardManager awemeCardManager = AwemeCardManager.LIZIZ;
        List listSingletonList = Collections.singletonList((C869590Y9l) c463020IDs.l0);
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL((List) obj);
        awemeCardManager.getClass();
        AwemeCardManager.LJII(c869590Y9l, listSingletonList);
    }

    public static final void onSuccess$1(C463020IDs c463020IDs, Object obj) {
        Map map = (Map) c463020IDs.l0;
        for (C869590Y9l c869590Y9l : (List) obj) {
            List list = (List) map.get(Long.valueOf(c869590Y9l.getMsgId()));
            if (list != null) {
                AwemeCardManager.LIZIZ.getClass();
                AwemeCardManager.LJII(c869590Y9l, list);
            }
        }
    }

    public static final void onSuccess$2(C463020IDs c463020IDs, Object obj) {
        List<? extends C869590Y9l> list = (List) obj;
        if (list != null) {
            ((QuotedMessageViewModel) c463020IDs.l0).zQ2(list, null);
        }
    }
}
