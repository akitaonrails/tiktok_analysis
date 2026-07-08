package X;

import com.ss.android.ugc.aweme.shortvideo.filter.k;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0suO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644980suO extends k {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final InterfaceC1731706qJ LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644980suO.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIIIL = 8;
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLLII.getValue(this, LLLIIII[0]);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.filter.k, X.C1644970suN, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1647420syK recordAdapterApi;
        super.onCreate();
        if (!C1622090sJT.LIZ(R5()) || (recordAdapterApi = getRecordAdapterApi()) == null) {
            return;
        }
        recordAdapterApi.Tb2(this);
    }

    public C1644980suO(C1DRG c1drg, String str, String str2, boolean z, C1645020suS c1645020suS) {
        super(c1drg, str, str2, z, c1645020suS, AFwS266S0000000_25.get$arr$(142), AFwS214S0000000_25.get$arr$(137), null);
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    }
}
