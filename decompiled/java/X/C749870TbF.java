package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.model.Operation;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0TbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749870TbF extends AbstractC749880TbG {
    public final Context LLILZ;
    public final DataChannel LLILZIL;
    public final List<User> LLILZLL = new ArrayList();
    public Map<Long, Operation> LLIZ = new HashMap();
    public C749890TbH LLIZLLLIL;
    public final String LLJ;
    public final long LLJI;
    public final long LLJIJIL;

    @Override // X.AbstractC749920TbK
    public final int getBasicItemCount() {
        return ((ArrayList) this.LLILZLL).size();
    }

    public final void LLLFZ(long j) {
        for (int size = ((ArrayList) this.LLILZLL).size() - 1; size >= 0; size--) {
            User user = (User) ListProtector.get(this.LLILZLL, size);
            if (user != null && user.getId() == j) {
                ListProtector.remove(this.LLILZLL, size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public C749870TbF(Context context, String str, long j, long j2, DataChannel dataChannel) {
        this.LLILZ = context;
        this.LLJ = str;
        this.LLJI = j;
        this.LLJIJIL = j2;
        this.LLILZIL = dataChannel;
    }
}
