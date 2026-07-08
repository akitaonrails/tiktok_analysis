package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Assem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.06Y0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06Y0 extends C09AY implements InterfaceC1685420txc<UIAssem, Boolean, Boolean, List<? extends String>, Map<String, ? extends Aweme>, Unit> {
    public final /* synthetic */ StoryArchiveV2Assem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Y0(StoryArchiveV2Assem storyArchiveV2Assem) {
        super(5);
        this.LL = storyArchiveV2Assem;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(UIAssem uIAssem, Boolean bool, Boolean bool2, List<? extends String> list, Map<String, ? extends Aweme> map) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        List<? extends String> list2 = list;
        Map<String, ? extends Aweme> map2 = map;
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelGo = this.LL.Go();
        storyArchiveV2ArchiveViewModelGo.getClass();
        if (!zBooleanValue && zBooleanValue2) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (!map2.keySet().contains(str)) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                String json = GsonProtectorUtils.toJson(C05N6.LIZ().getGson(), C13LP.LLD(20, arrayList));
                storyArchiveV2ArchiveViewModelGo.setState(AFwS256S0000000_18.get$arr$(848));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyArchiveV2ArchiveViewModelGo), C0PEM.LIZJ, null, new C331301Qh(json, storyArchiveV2ArchiveViewModelGo, map2, null), 2);
            }
        }
        return Unit.LIZ;
    }
}
