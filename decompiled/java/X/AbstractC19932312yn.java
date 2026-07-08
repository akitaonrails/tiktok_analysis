package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19932312yn extends AbstractC19924812xa implements InterfaceC19930912yZ {
    public int LL = -1;

    public List<String> findInitializationErrors() {
        ArrayList arrayList = new ArrayList();
        C19932112yl.LIZ(this, "", arrayList);
        return arrayList;
    }

    @Override // X.InterfaceC19925612xi
    public int getSerializedSize() {
        int i = this.LL;
        if (i != -1) {
            return i;
        }
        int iLIZIZ = C19932112yl.LIZIZ(this, getAllFields());
        this.LL = iLIZIZ;
        return iLIZIZ;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iLIZJ = (LIZJ(779 + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iLIZJ;
        return iLIZJ;
    }

    @Override // X.InterfaceC19916512wF
    public /* bridge */ /* synthetic */ InterfaceC19925612xi getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public String getInitializationErrorString() {
        List<String> listFindInitializationErrors = findInitializationErrors();
        StringBuilder sb = new StringBuilder();
        for (String str : listFindInitializationErrors) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // X.InterfaceC19916512wF
    public boolean isInitialized() {
        for (C19939112zt c19939112zt : getDescriptorForType().LJIJJ()) {
            if (c19939112zt.LJJIJ() && !hasField(c19939112zt)) {
                return false;
            }
        }
        for (Map.Entry<C19939112zt, Object> entry : getAllFields().entrySet()) {
            C19939112zt key = entry.getKey();
            if (key.LJIJJ() == EnumC19937812zg.MESSAGE) {
                if (key.LJJLJ()) {
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        if (!((InterfaceC19916512wF) it2.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC19916512wF) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC19925612xi
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // X.AbstractC19924812xa
    public final C19918012wU newUninitializedMessageException() {
        return AbstractC19931812yi.LJI(this);
    }

    @Override // X.InterfaceC19925612xi
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 toBuilder() {
        return toBuilder();
    }

    public final String toString() {
        return C19932212ym.LIZ().LIZLLL(this);
    }

    @Override // X.AbstractC19924812xa
    public final int getMemoizedSerializedSize() {
        return this.LL;
    }

    public static Map LIZIZ(List list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        Iterator it2 = list.iterator();
        InterfaceC19933112yv interfaceC19933112yv = (InterfaceC19933112yv) it2.next();
        AnonymousClass1301 descriptorForType = interfaceC19933112yv.getDescriptorForType();
        C19939112zt c19939112ztLJIIZILJ = descriptorForType.LJIIZILJ("key");
        C19939112zt c19939112ztLJIIZILJ2 = descriptorForType.LJIIZILJ("value");
        Object field = interfaceC19933112yv.getField(c19939112ztLJIIZILJ2);
        if (field instanceof C199423130z) {
            field = Integer.valueOf(((C199423130z) field).getNumber());
        }
        map.put(interfaceC19933112yv.getField(c19939112ztLJIIZILJ), field);
        while (it2.hasNext()) {
            InterfaceC19933112yv interfaceC19933112yv2 = (InterfaceC19933112yv) it2.next();
            Object field2 = interfaceC19933112yv2.getField(c19939112ztLJIIZILJ2);
            if (field2 instanceof C199423130z) {
                field2 = Integer.valueOf(((C199423130z) field2).getNumber());
            }
            map.put(interfaceC19933112yv2.getField(c19939112ztLJIIZILJ), field2);
        }
        return map;
    }

    public InterfaceC19931912yj LIZLLL(InterfaceC19935412zI interfaceC19935412zI) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC19930912yZ)) {
            return false;
        }
        InterfaceC19933112yv interfaceC19933112yv = (InterfaceC19933112yv) obj;
        if (getDescriptorForType() != interfaceC19933112yv.getDescriptorForType()) {
            return false;
        }
        Map<C19939112zt, Object> allFields = getAllFields();
        Map<C19939112zt, Object> allFields2 = interfaceC19933112yv.getAllFields();
        if (allFields.size() == allFields2.size()) {
            for (C19939112zt c19939112zt : allFields.keySet()) {
                if (allFields2.containsKey(c19939112zt)) {
                    Object obj2 = allFields.get(c19939112zt);
                    Object obj3 = allFields2.get(c19939112zt);
                    if (c19939112zt.LJJI() == EnumC19937712zf.BYTES) {
                        if (c19939112zt.LJJLJ()) {
                            List list = (List) obj2;
                            List list2 = (List) obj3;
                            if (list.size() == list2.size()) {
                                for (int i = 0; i < list.size(); i++) {
                                    if (!LIZ(ListProtector.get(list, i), ListProtector.get(list2, i))) {
                                        return false;
                                    }
                                }
                            } else {
                                return false;
                            }
                        } else if (!LIZ(obj2, obj3)) {
                            return false;
                        }
                    } else if (c19939112zt.LJJIIJ()) {
                        if (!C19914812vy.LJ(LIZIZ((List) obj2), LIZIZ((List) obj3))) {
                            return false;
                        }
                    } else if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (getUnknownFields().equals(interfaceC19933112yv.getUnknownFields())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C19939112zt getOneofFieldDescriptor(C19939212zu c19939212zu) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public boolean hasOneof(C19939212zu c19939212zu) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    @Override // X.AbstractC19924812xa
    public final void setMemoizedSerializedSize(int i) {
        this.LL = i;
    }

    @Override // X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C19932112yl.LJ(this, getAllFields(), abstractC19928912yF);
    }

    public static boolean LIZ(Object obj, Object obj2) {
        AbstractC19922812xG abstractC19922812xGCopyFrom;
        if (obj instanceof byte[]) {
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            abstractC19922812xGCopyFrom = AbstractC19922812xG.copyFrom((byte[]) obj);
        } else {
            abstractC19922812xGCopyFrom = (AbstractC19922812xG) obj;
        }
        if (obj2 instanceof byte[]) {
            obj2 = AbstractC19922812xG.copyFrom((byte[]) obj2);
        }
        return abstractC19922812xGCopyFrom.equals(obj2);
    }

    public static int LIZJ(int i, Map<C19939112zt, Object> map) {
        int i2;
        int iLIZ;
        for (Map.Entry<C19939112zt, Object> entry : map.entrySet()) {
            C19939112zt key = entry.getKey();
            Object value = entry.getValue();
            int number = (i * 37) + key.getNumber();
            if (key.LJJIIJ()) {
                i2 = number * 53;
                iLIZ = C19914812vy.LIZ(LIZIZ((List) value));
            } else if (key.LJJI() != EnumC19937712zf.ENUM) {
                i2 = number * 53;
                iLIZ = value.hashCode();
            } else if (key.LJJLJ()) {
                int i3 = number * 53;
                Iterator it2 = ((List) value).iterator();
                int number2 = 1;
                while (it2.hasNext()) {
                    number2 = (number2 * 31) + ((InterfaceC19931112yb) it2.next()).getNumber();
                }
                i = i3 + number2;
            } else {
                i2 = number * 53;
                iLIZ = ((InterfaceC19931112yb) value).getNumber();
            }
            i = i2 + iLIZ;
        }
        return i;
    }
}
