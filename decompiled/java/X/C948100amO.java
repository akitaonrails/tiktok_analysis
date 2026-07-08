package X;

import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;

/* JADX INFO: renamed from: X.0amO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948100amO implements InterfaceC758670TpR {
    public GuideLayoutDetailsResponse.AnchorLayoutSetting LIZ = new GuideLayoutDetailsResponse.AnchorLayoutSetting();
    public Integer LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public Integer LJFF;

    @Override // X.InterfaceC758670TpR
    public final int LIZ() {
        Integer num = this.LJFF;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int LIZIZ() {
        Integer num = this.LIZIZ;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }
}
