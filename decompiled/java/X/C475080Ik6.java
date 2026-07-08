package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0Ik6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475080Ik6 extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public final C16F5 LLILLJJLI;
    public final /* synthetic */ C475060Ik4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475080Ik6(C475060Ik4 c475060Ik4, View view) {
        super(view);
        this.LLILLL = c475060Ik4;
        this.LL = (ViewGroup) view.findViewById(R.id.fs6);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.zi8);
    }

    public final boolean I5(long j, String str) {
        HashSet<String> hashSet;
        Answer answer = this.LLILLL.LLILZ.get(Long.valueOf(j));
        if (answer != null && (hashSet = answer.answers) != null && hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    public final void L5(long j, String str) {
        Answer answer = this.LLILLL.LLILZ.get(Long.valueOf(j));
        if (answer != null) {
            HashSet<String> hashSet = answer.answers;
            if (hashSet != null) {
                hashSet.clear();
            }
        } else {
            answer = new Answer(j, new HashSet());
        }
        answer.answers.add(str);
        this.LLILLL.LLILZ.put(Long.valueOf(j), answer);
        InterfaceC475100Ik8 interfaceC475100Ik8 = this.LLILLL.LLILZIL;
        if (interfaceC475100Ik8 != null) {
            interfaceC475100Ik8.eM();
        }
    }
}
