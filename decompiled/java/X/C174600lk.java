package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS275S0300000_31;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.00lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C174600lk extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ BasePlaybookEditorViewModel LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ InterfaceC170900l9<Playbook> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C174600lk(BasePlaybookEditorViewModel basePlaybookEditorViewModel, AwS275S0300000_31 awS275S0300000_31, C20380414os c20380414os) {
        super(2);
        this.LL = basePlaybookEditorViewModel;
        this.LLILLJJLI = awS275S0300000_31;
        this.LLILLL = c20380414os;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        Playbook playbook;
        PlaybookContent playbookContent;
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            C20379114of value = this.LL.LLILLL.LIZIZ.getValue();
            if (value != null && (playbook = value.LIZ) != null && (playbookContent = playbook.content) != null) {
                playbookContent.coverUri = str3;
            }
            this.LLILLJJLI.invoke();
        } else {
            this.LLILLL.onFailed(new Throwable("Upload image fail"));
        }
        return Unit.LIZ;
    }
}
