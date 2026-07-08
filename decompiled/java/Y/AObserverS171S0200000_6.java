package Y;

import X.C0HCH;
import X.C197039127h;
import X.C786410Ut5;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSheetFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserFragment;
import irm.AkS52S0200000_6;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class AObserverS171S0200000_6 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
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
        }
    }

    public static final void onChanged$0(AObserverS171S0200000_6 aObserverS171S0200000_6, Object obj) {
        ((MediatorLiveData) aObserverS171S0200000_6.l0).setValue(new Pair(obj, ((StoryNotePanelUserFragment) aObserverS171S0200000_6.l1).UR().LLJI.getValue()));
    }

    public static final void onChanged$1(AObserverS171S0200000_6 aObserverS171S0200000_6, Object obj) {
        ((MediatorLiveData) aObserverS171S0200000_6.l0).setValue(new Pair(((StoryNotePanelUserFragment) aObserverS171S0200000_6.l1).UR().LLIZLLLIL.getValue(), obj));
    }

    public static final void onChanged$2(AObserverS171S0200000_6 aObserverS171S0200000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C786410Ut5.LJLLLLLL(8, ((C0HCH) aObserverS171S0200000_6.l0).LLILZLL);
            C786410Ut5.LJLLLLLL(8, ((C0HCH) aObserverS171S0200000_6.l0).LLIZ);
            C786410Ut5.LJLLLLLL(0, ((C0HCH) aObserverS171S0200000_6.l0).LLIZLLLIL);
            C197039127h c197039127h = ((C0HCH) aObserverS171S0200000_6.l0).LLILLL;
            StoryThoughtAvatarSheetFragment storyThoughtAvatarSheetFragment = (StoryThoughtAvatarSheetFragment) aObserverS171S0200000_6.l1;
            c197039127h.setText(storyThoughtAvatarSheetFragment.getString(2131850189));
            C786410Ut5.I7(new AkS52S0200000_6(c197039127h, storyThoughtAvatarSheetFragment, 15), c197039127h);
            return;
        }
        C786410Ut5.LJLLLLLL(8, ((C0HCH) aObserverS171S0200000_6.l0).LLIZLLLIL);
        C197039127h c197039127h2 = ((C0HCH) aObserverS171S0200000_6.l0).LLILLL;
        C786410Ut5.I7(new AkS52S0200000_6(c197039127h2, (StoryThoughtAvatarSheetFragment) aObserverS171S0200000_6.l1, 14), c197039127h2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS171S0200000_6(Object obj, MediatorLiveData<Pair<User, Long>> mediatorLiveData, StoryNotePanelUserFragment storyNotePanelUserFragment) {
        this.$t = storyNotePanelUserFragment;
        this.l0 = obj;
        this.l1 = mediatorLiveData;
    }
}
