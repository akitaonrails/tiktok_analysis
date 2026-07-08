package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;

/* JADX INFO: renamed from: X.0jKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276880jKg implements InterfaceC780300UjE {
    public final String LIZ;
    public final InterfaceC1276870jKf LIZIZ;

    public C1276880jKg() {
        this.LIZ = "default";
        this.LIZIZ = new InterfaceC1276870jKf() { // from class: X.0jKi
            @Override // X.InterfaceC1276870jKf
            public final int LIZ(String str) {
                return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).A32(str);
            }
        };
    }

    public C1276880jKg(String str) {
        this.LIZ = "default";
        this.LIZIZ = new InterfaceC1276870jKf() { // from class: X.0jKi
            @Override // X.InterfaceC1276870jKf
            public final int LIZ(String str2) {
                return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).A32(str2);
            }
        };
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x05a3 A[Catch: all -> 0x05d8, TryCatch #6 {all -> 0x05d8, blocks: (B:229:0x0595, B:231:0x05a3, B:233:0x05ab, B:236:0x05b3, B:238:0x05bb, B:240:0x05c6, B:242:0x05ce, B:244:0x05d3), top: B:262:0x0595 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC780300UjE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r22, org.json.JSONObject r23) {
        /*
            Method dump skipped, instruction units count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276880jKg.LIZ(java.lang.String, org.json.JSONObject):void");
    }
}
