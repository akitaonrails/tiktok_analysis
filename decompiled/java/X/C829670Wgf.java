package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMCustomParamData;
import com.tiktok.ttm.ttmparam.TTMStringParam;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829670Wgf extends TTMCustomParamData implements InterfaceC829710Wgj {
    public final String LIZIZ;
    public final ITTMParamData LIZJ;
    public ITTMParamData LIZLLL;

    @Override // X.InterfaceC829710Wgj
    public final InterfaceC829710Wgj LIZIZ() {
        return new C829670Wgf(this.LIZIZ, this.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String[] getDictKeys() {
        ITTMParamData iTTMParamData = this.LIZJ;
        String[] dictKeys = iTTMParamData != null ? iTTMParamData.getDictKeys() : null;
        int i = 2;
        String[] strArr = new String[(dictKeys != null ? dictKeys.length : 0) + 2];
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        strArr[0] = "al_event_key";
        c829700Wgi.getClass();
        strArr[1] = "custom_param_key";
        if (dictKeys != null) {
            C089E c089e = new C089E(dictKeys);
            while (c089e.hasNext()) {
                strArr[i] = c089e.next();
                i++;
            }
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String[] getDictStringValuesImmediate() {
        ITTMParamData iTTMParamData = this.LIZJ;
        String[] dictStringValuesImmediate = iTTMParamData != null ? iTTMParamData.getDictStringValuesImmediate() : null;
        String[] strArr = new String[(dictStringValuesImmediate != null ? dictStringValuesImmediate.length : 0) + 2];
        strArr[0] = this.LIZIZ;
        if (dictStringValuesImmediate != null) {
            C089E c089e = new C089E(dictStringValuesImmediate);
            int i = 1;
            while (c089e.hasNext()) {
                Object next = c089e.next();
                if (next != null) {
                    strArr[i] = next;
                    i++;
                } else {
                    strArr[i] = 0;
                    i++;
                }
            }
        }
        return strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object[] getDictValuesImmediate() {
        ITTMParamData iTTMParamData = this.LIZJ;
        Object[] dictValuesImmediate = iTTMParamData != null ? iTTMParamData.getDictValuesImmediate() : null;
        int i = 2;
        Object[] objArr = new Object[(dictValuesImmediate != null ? dictValuesImmediate.length : 0) + 2];
        String str = this.LIZIZ;
        objArr[0] = str;
        if (dictValuesImmediate != null) {
            objArr[1] = str;
            C089E c089e = new C089E(dictValuesImmediate);
            while (c089e.hasNext()) {
                objArr[i] = c089e.next();
                i++;
            }
        }
        return objArr;
    }

    @Override // X.InterfaceC829710Wgj
    public final boolean LIZ(Set<String> set) {
        if (!set.isEmpty() && !C13LP.LJJJJ(this.LIZIZ, set)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC829710Wgj
    public final void LIZJ(ITTMParamData iTTMParamData) {
        this.LIZLLL = iTTMParamData;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean containsKey(String str) {
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        if (!Intrinsics.LJFF(str, "custom_param_key")) {
            c829700Wgi.getClass();
            if (!Intrinsics.LJFF(str, "al_event_key")) {
                return super.containsKey(str);
            }
            return true;
        }
        return true;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final double[] getAllDoubleValue(String str) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData == null) {
                    return null;
                }
                return iTTMParamData.getAllDoubleValue(null);
            }
        }
        return super.getAllDoubleValue(str);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final long[] getAllIntValue(String str) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData == null) {
                    return null;
                }
                return iTTMParamData.getAllIntValue(null);
            }
        }
        return super.getAllIntValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] getAllStringValue(java.lang.String r8) {
        /*
            r7 = this;
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = r7.LIZJ
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L54
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = r7.LIZLLL
            r2 = 0
            if (r0 == 0) goto L23
            X.0Wgi r0 = X.InterfaceC829710Wgj.LIZ
            r0.getClass()
            java.lang.String r0 = "custom_param_key"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L23
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = r7.LIZLLL
            if (r0 != 0) goto L32
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = r7.LIZIZ
            r1[r5] = r0
            return r1
        L23:
            if (r8 == 0) goto L4d
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = r7.LIZJ
            java.lang.String[] r1 = r0.getAllStringValue(r8)
            if (r1 == 0) goto L4d
            com.tiktok.ttm.ttmparam.TTMStringArrayParam r0 = new com.tiktok.ttm.ttmparam.TTMStringArrayParam
            r0.<init>(r1)
        L32:
            java.lang.String[] r4 = r0.getAllStringValue(r2)
            int r0 = r4.length
            int r0 = r0 + 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = r7.LIZIZ
            r3[r5] = r0
            int r2 = r4.length
        L40:
            if (r5 >= r2) goto L4c
            r1 = r4[r5]
            int r0 = r6 + 1
            r3[r6] = r1
            int r5 = r5 + 1
            r6 = r0
            goto L40
        L4c:
            return r3
        L4d:
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = r7.LIZIZ
            r1[r5] = r0
            return r1
        L54:
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = r7.LIZIZ
            r1[r5] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829670Wgf.getAllStringValue(java.lang.String):java.lang.String[]");
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        if (Intrinsics.LJFF(str, "al_event_key")) {
            return new TTMStringParam(this.LIZIZ);
        }
        if (this.LIZLLL != null) {
            c829700Wgi.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                return this.LIZLLL;
            }
        }
        return super.getObjectItem(str);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final void removeData(String str) {
        ITTMParamData iTTMParamData = this.LIZJ;
        if (iTTMParamData != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            iTTMParamData.removeData("al_event_key");
        }
    }

    public C829670Wgf(String str, ITTMParamData iTTMParamData) {
        super(iTTMParamData);
        this.LIZIZ = str;
        this.LIZJ = iTTMParamData;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final double getDoubleValue(String str, int i) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData != null) {
                    return iTTMParamData.getDoubleValue(str, i);
                }
                return Double.MAX_VALUE;
            }
        }
        return super.getDoubleValue(str, i);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData != null) {
                    return iTTMParamData.getIntValue(str, i);
                }
                return Long.MAX_VALUE;
            }
        }
        return super.getIntValue(str, i);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMCustomParamData, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        if (Intrinsics.LJFF(str, "al_event_key")) {
            return this.LIZIZ;
        }
        if (this.LIZLLL != null) {
            c829700Wgi.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData != null) {
                    return iTTMParamData.getStringValue(str, i);
                }
                return null;
            }
        }
        return super.getStringValue(str, i);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) {
        ITTMParamData iTTMParamData2 = this.LIZJ;
        if (iTTMParamData2 != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            iTTMParamData2.mergeDataAsSubData("al_event_key", new TTMStringParam(this.LIZIZ));
        }
        ITTMParamData iTTMParamData3 = this.LIZJ;
        if (iTTMParamData3 != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            iTTMParamData3.mergeDataAsSubData("custom_param_key", this.LIZLLL);
        }
        ITTMParamData iTTMParamData4 = this.LIZJ;
        if (iTTMParamData4 != null) {
            iTTMParamData4.mergeDataAsSubData(str, iTTMParamData);
        }
    }
}
