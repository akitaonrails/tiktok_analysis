package Y;

import X.C0XHP;
import X.C127A;
import X.C20334214hQ;
import X.C20496915Ih;
import X.C20497415Im;
import X.C20497615Io;
import X.C20580115fz;
import X.C20581915gH;
import X.C20584715gj;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AObserverS131S0300000_31 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObserverS131S0300000_31 aObserverS131S0300000_31, Object obj) {
        if (obj != C0XHP.NOT_READY) {
            ((IOneClickLoginService) aObserverS131S0300000_31.l0).LJIIZILJ().removeObservers((LifecycleOwner) aObserverS131S0300000_31.l1);
            boolean zLJIIJJI = ((IOneClickLoginService) aObserverS131S0300000_31.l0).LJIIJJI();
            SecuritySaveInfoCell securitySaveInfoCell = (SecuritySaveInfoCell) aObserverS131S0300000_31.l2;
            C20334214hQ c20334214hQ = (C20334214hQ) securitySaveInfoCell.getItem();
            if (c20334214hQ != null) {
                c20334214hQ.LLILLL = zLJIIJJI;
            }
            securitySaveInfoCell.L5();
            C127A c127a = ((SecuritySaveInfoCell) aObserverS131S0300000_31.l2).LLILLL;
            if (c127a != null) {
                c127a.LJIIIZ(true);
            }
        }
    }

    public static final void onChanged$1(AObserverS131S0300000_31 aObserverS131S0300000_31, Object obj) {
        C20496915Ih c20496915Ih;
        if (Intrinsics.LJFF(obj, C20497415Im.LIZ) && (c20496915Ih = (C20496915Ih) ((LiveData) aObserverS131S0300000_31.l0).getValue()) != null && c20496915Ih.LIZ == Integer.MAX_VALUE) {
            ((Function0) aObserverS131S0300000_31.l1).invoke();
        }
        if (Intrinsics.LJFF(obj, C20497615Io.LIZ)) {
            ((Function0) aObserverS131S0300000_31.l2).invoke();
        }
    }

    public static final void onChanged$2(AObserverS131S0300000_31 aObserverS131S0300000_31, Object obj) throws Throwable {
        String value = ((StoryThoughtCreationFragment) aObserverS131S0300000_31.l0).SR().LLIZ.getValue();
        int selectionStart = ((C20584715gj) aObserverS131S0300000_31.l1).getSelectionStart();
        int selectionEnd = ((C20584715gj) aObserverS131S0300000_31.l1).getSelectionEnd();
        ((C20581915gH) aObserverS131S0300000_31.l2).LLJILLL.LJIIL(value, (List) obj);
        ((C20584715gj) aObserverS131S0300000_31.l1).setSelection(selectionStart, selectionEnd);
    }

    public static final void onChanged$3(AObserverS131S0300000_31 aObserverS131S0300000_31, Object obj) {
        BackgroundModel backgroundModel = (BackgroundModel) obj;
        if (!((StoryThoughtAvatarCreationFragment) aObserverS131S0300000_31.l0).WR().LLLLLLJ) {
            ((C20580115fz) aObserverS131S0300000_31.l1).LLJJJ.LIZIZ((User) aObserverS131S0300000_31.l2, backgroundModel, null);
        }
    }

    public AObserverS131S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
