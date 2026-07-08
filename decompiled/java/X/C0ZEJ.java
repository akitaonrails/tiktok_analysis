package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS28S0001000_14;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: renamed from: X.0ZEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C0ZEJ extends C2217421BqW implements Function1<Aweme, Unit> {
    public C0ZEJ(Object obj) {
        super(1, obj, BotSharePostPickerViewModel.class, "toggleSelection", "toggleSelection(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Aweme aweme) {
        BotSharePostPickerViewModel botSharePostPickerViewModel = (BotSharePostPickerViewModel) this.receiver;
        botSharePostPickerViewModel.getClass();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        if (aid.length() != 0) {
            int i = botSharePostPickerViewModel.getState().LLILZ;
            if (botSharePostPickerViewModel.LLILZIL.contains(aid)) {
                botSharePostPickerViewModel.LLILZIL.remove(aid);
            } else if (botSharePostPickerViewModel.LLILZIL.size() >= i) {
                botSharePostPickerViewModel.setState(new AwS28S0001000_14(i, 2));
            } else {
                botSharePostPickerViewModel.LLILZIL.add(aid);
            }
            botSharePostPickerViewModel.setState(new AwS380S0200000_14(botSharePostPickerViewModel.yQ2(botSharePostPickerViewModel.LLILZ), (List<C0HIA>) C13LP.LLIIJI(botSharePostPickerViewModel.LLILZIL), (Set<String>) 85));
        }
        return Unit.LIZ;
    }
}
