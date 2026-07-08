package X;

import Y.ARunnableS57S0300000_24;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: renamed from: X.0rmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1601650rmV implements InterfaceC1333005Jo<FeedItemList> {
    public final String LIZ;

    public void LIZIZ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
    }

    public void LIZJ(C1601460rmC c1601460rmC, FeedItemList feedItemList) {
    }

    @Override // X.InterfaceC1333005Jo
    public final int getType() {
        return 1;
    }

    @Override // X.InterfaceC1333005Jo
    public final String getTag() {
        return this.LIZ;
    }

    public C1601650rmV(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1333005Jo
    public void LIZ(C1440305kP<FeedItemList> c1440305kP) {
        C1601460rmC c1601460rmC = c1440305kP.LIZIZ;
        FeedItemList feedItemList = c1440305kP.LIZJ;
        LIZJ(c1601460rmC, feedItemList);
        C823050WQl.LIZLLL().execute(new ARunnableS57S0300000_24(this, c1601460rmC, feedItemList, 21));
    }
}
