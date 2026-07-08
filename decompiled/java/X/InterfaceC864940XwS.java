package X;

import com.bytedance.im.core.model.DeleteMsgRequest;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.util.Map;

/* JADX INFO: renamed from: X.0XwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC864940XwS {
    Map<Long, DeleteMsgRequest> LIZ();

    void LIZIZ(long j);

    void LIZJ(int i, Long l, DeleteMessageRequestBody deleteMessageRequestBody);

    void LIZLLL(int i, Long l, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody);

    void init();
}
