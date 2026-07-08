package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19932112yl {
    public static int LIZIZ(InterfaceC19930912yZ interfaceC19930912yZ, Map<C19939112zt, Object> map) {
        int serializedSize;
        int iLJI;
        boolean messageSetWireFormat = interfaceC19930912yZ.getDescriptorForType().LJIJJLI().getMessageSetWireFormat();
        int i = 0;
        for (Map.Entry<C19939112zt, Object> entry : map.entrySet()) {
            C19939112zt key = entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && key.LJJIII() && key.LJJI() == EnumC19937712zf.MESSAGE && !key.LJJLJ()) {
                iLJI = AbstractC19928912yF.LJI(key.getNumber(), (InterfaceC19925612xi) value);
            } else {
                iLJI = C19928612yC.LJI(key, value);
            }
            i += iLJI;
        }
        C19927612y2 unknownFields = interfaceC19930912yZ.getUnknownFields();
        if (messageSetWireFormat) {
            serializedSize = unknownFields.LIZ();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return i + serializedSize;
    }

    public static void LIZ(InterfaceC19933112yv interfaceC19933112yv, String str, List<String> list) {
        for (C19939112zt c19939112zt : interfaceC19933112yv.getDescriptorForType().LJIJJ()) {
            if (c19939112zt.LJJIJ() && !interfaceC19933112yv.hasField(c19939112zt)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(c19939112zt.LJIIIZ());
                ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        for (Map.Entry<C19939112zt, Object> entry : interfaceC19933112yv.getAllFields().entrySet()) {
            C19939112zt key = entry.getKey();
            Object value = entry.getValue();
            if (key.LJIJJ() == EnumC19937812zg.MESSAGE) {
                if (key.LJJLJ()) {
                    Iterator it2 = ((List) value).iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        LIZ((InterfaceC19933112yv) it2.next(), LIZLLL(str, key, i), list);
                        i++;
                    }
                } else if (interfaceC19933112yv.hasField(key)) {
                    LIZ((InterfaceC19933112yv) value, LIZLLL(str, key, -1), list);
                }
            }
        }
    }

    public static String LIZLLL(String str, C19939112zt c19939112zt, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (c19939112zt.LJJIII()) {
            sb.append('(');
            sb.append(c19939112zt.LLILZIL);
            sb.append(')');
        } else {
            sb.append(c19939112zt.LJIIIZ());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    public static void LJ(InterfaceC19930912yZ interfaceC19930912yZ, Map map, AbstractC19928912yF abstractC19928912yF) {
        boolean messageSetWireFormat = interfaceC19930912yZ.getDescriptorForType().LJIJJLI().getMessageSetWireFormat();
        for (Map.Entry entry : map.entrySet()) {
            C19939112zt c19939112zt = (C19939112zt) entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && c19939112zt.LJJIII() && c19939112zt.LJJI() == EnumC19937712zf.MESSAGE && !c19939112zt.LJJLJ()) {
                abstractC19928912yF.LJJIIZ(c19939112zt.getNumber(), (InterfaceC19925612xi) value);
            } else {
                C19928612yC.LJJII(c19939112zt, value, abstractC19928912yF);
            }
        }
        C19927612y2 unknownFields = interfaceC19930912yZ.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.LIZIZ(abstractC19928912yF);
        } else {
            unknownFields.writeTo(abstractC19928912yF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.AbstractC19927312xz r8, X.C19927512y1 r9, X.C19926312xp r10, X.AnonymousClass1301 r11, X.InterfaceC19932912yt r12, int r13) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19932112yl.LIZJ(X.12xz, X.12y1, X.12xp, X.1301, X.12yt, int):boolean");
    }
}
