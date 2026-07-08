package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HCO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM$sendMessage$1", f = "StoryNotePanelUserVM.kt", l = {283}, m = "invokeSuspend")
public final class C0HCO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryNotePanelUserVM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HCO(StoryNotePanelUserVM storyNotePanelUserVM, boolean z, String str, boolean z2, InterfaceC1364105Vn<? super C0HCO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyNotePanelUserVM;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HCO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objWQ2 = obj;
        C1C7U.LIZ("StoryNotePanelUserVM@e1c1.sendMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String nickname = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objWQ2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objWQ2);
            StoryNotePanelUserVM storyNotePanelUserVM = this.LLILLJJLI;
            StoryNoteDataCollection storyNoteDataCollection = storyNotePanelUserVM.LL;
            if (storyNoteDataCollection != null && (str = storyNoteDataCollection.aid) != null) {
                this.LL = 1;
                objWQ2 = storyNotePanelUserVM.wQ2(str, this);
                if (objWQ2 == objLJFF) {
                    C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.sendMessage$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.sendMessage$1");
            return unit;
        }
        Aweme aweme = (Aweme) objWQ2;
        if (aweme != null && aweme.getAuthor() != null) {
            if (this.LLILLL) {
                MutableLiveData<String> mutableLiveData = this.LLILLJJLI.LLJJJIL;
                User author = aweme.getAuthor();
                if (author != null) {
                    nickname = author.getNickname();
                }
                mutableLiveData.setValue(nickname);
            }
            C0S1K c0s1k = (C0S1K) this.LLILLJJLI.LLILZIL.getValue();
            String str2 = this.LLILZ;
            User author2 = aweme.getAuthor();
            StoryNotePanelUserVM storyNotePanelUserVM2 = this.LLILLJJLI;
            String str3 = storyNotePanelUserVM2.LLILLJJLI;
            String str4 = storyNotePanelUserVM2.LLILLL;
            c0s1k.LIZJ(str2, author2, aweme, str3, str4, str4, true, this.LLILZIL, null, AFwS236S0000000_6.get$arr$(9));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.sendMessage$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("StoryNotePanelUserVM@e1c1.sendMessage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
