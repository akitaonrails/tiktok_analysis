package X;

import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09Ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2390209Ye {
    public final C2390309Yf LIZ;
    public final List<List<C09YW>> LIZIZ = new ArrayList();
    public final List<C09YW> LIZJ = new ArrayList();
    public final /* synthetic */ C09YZ LIZLLL;

    public final C2390209Ye LIZ(C09YW... c09ywArr) {
        if (c09ywArr.length != 0) {
            ((ArrayList) this.LIZIZ).add(C13LQ.LJJLL(c09ywArr));
        }
        return this;
    }

    public C2390209Ye(List<SchemaParserData> list, C09YZ c09yz) {
        this.LIZLLL = c09yz;
        this.LIZ = new C2390309Yf(list);
    }
}
