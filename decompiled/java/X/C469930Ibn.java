package X;

import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ibn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469930Ibn extends C09AY implements Function1<C469920Ibm, C469920Ibm> {
    public final /* synthetic */ List<SMBBoardColorPreset> LL;
    public final /* synthetic */ List<Integer> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469930Ibn(List<SMBBoardColorPreset> list, List<Integer> list2) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C469920Ibm invoke(C469920Ibm c469920Ibm) {
        C469920Ibm c469920Ibm2 = c469920Ibm;
        List<SMBBoardColorPreset> list = this.LL;
        List<Integer> list2 = this.LLILLJJLI;
        List<BoardTextFontStyleData> list3 = c469920Ibm2.LL;
        c469920Ibm2.getClass();
        return new C469920Ibm(list3, list, list2);
    }
}
