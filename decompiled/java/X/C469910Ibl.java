package X;

import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ibl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469910Ibl extends C09AY implements Function1<C469920Ibm, C469920Ibm> {
    public final /* synthetic */ List<BoardTextFontStyleData> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469910Ibl(List<BoardTextFontStyleData> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C469920Ibm invoke(C469920Ibm c469920Ibm) {
        C469920Ibm c469920Ibm2 = c469920Ibm;
        ArrayList arrayList = new ArrayList(this.LL);
        List<SMBBoardColorPreset> list = c469920Ibm2.LLILLJJLI;
        List<Integer> list2 = c469920Ibm2.LLILLL;
        c469920Ibm2.getClass();
        return new C469920Ibm(arrayList, list, list2);
    }
}
