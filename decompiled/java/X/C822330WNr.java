package X;

import android.net.Uri;
import com.bytedance.pumbaa.hybrid.engine.api.model.ValueModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822330WNr implements C0WMD {
    public C0WN7 LIZ;
    public C828420Wee LIZIZ;

    @Override // X.C0WMD
    public final /* bridge */ /* synthetic */ Object LIZ() {
        return this.LIZ;
    }

    @Override // X.C0WMD
    public final C0WO4 LIZIZ(String str) {
        Object host;
        EnumC822340WNs enumC822340WNs;
        final ValueModel valueModel;
        Uri uri;
        Uri uri2;
        Object obj;
        Map<String, Object> map;
        EnumC822340WNs.Companion.getClass();
        EnumC822340WNs[] enumC822340WNsArrValues = EnumC822340WNs.values();
        int length = enumC822340WNsArrValues.length;
        int i = 0;
        while (true) {
            host = null;
            if (i < length) {
                enumC822340WNs = enumC822340WNsArrValues[i];
                if (Intrinsics.LJFF(enumC822340WNs.getValue(), str)) {
                    break;
                }
                i++;
            } else {
                enumC822340WNs = EnumC822340WNs.UNKNOWN;
                break;
            }
        }
        int i2 = C822350WNt.LIZ[enumC822340WNs.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C828420Wee c828420Wee = this.LIZIZ;
                            if (c828420Wee != null && (map = c828420Wee.LJFF) != null) {
                                obj = map.get(str);
                            } else {
                                obj = null;
                            }
                            if (obj instanceof Number) {
                                valueModel = new ValueModel(EnumC822390WNx.Int, Integer.valueOf(((Number) obj).intValue()), EnumC822390WNx.Null);
                            } else if (obj instanceof String) {
                                valueModel = new ValueModel(EnumC822390WNx.Str, obj, EnumC822390WNx.Null);
                            } else if (obj instanceof Boolean) {
                                valueModel = new ValueModel(EnumC822390WNx.Bool, obj, EnumC822390WNx.Null);
                            } else if (obj instanceof List) {
                                valueModel = new ValueModel(EnumC822390WNx.Array, obj, EnumC822390WNx.Null);
                            } else {
                                EnumC822390WNx enumC822390WNx = EnumC822390WNx.Str;
                                if (obj != null) {
                                    host = obj.toString();
                                }
                                valueModel = new ValueModel(enumC822390WNx, host, EnumC822390WNx.Null);
                            }
                        } else {
                            EnumC822390WNx enumC822390WNx2 = EnumC822390WNx.Int;
                            C0WN7 c0wn7 = this.LIZ;
                            if (c0wn7 != null) {
                                host = Integer.valueOf(c0wn7.LJI);
                            }
                            valueModel = new ValueModel(enumC822390WNx2, host, EnumC822390WNx.Null);
                        }
                    } else {
                        EnumC822390WNx enumC822390WNx3 = EnumC822390WNx.Int;
                        C0WN7 c0wn72 = this.LIZ;
                        if (c0wn72 == null || !c0wn72.LJIIIIZZ) {
                            i3 = 3;
                        }
                        valueModel = new ValueModel(enumC822390WNx3, Integer.valueOf(i3), EnumC822390WNx.Null);
                    }
                } else {
                    EnumC822390WNx enumC822390WNx4 = EnumC822390WNx.Str;
                    C0WN7 c0wn73 = this.LIZ;
                    if (c0wn73 != null && (uri2 = c0wn73.LJ) != null) {
                        host = uri2.getPath();
                    }
                    valueModel = new ValueModel(enumC822390WNx4, host, EnumC822390WNx.Null);
                }
            } else {
                EnumC822390WNx enumC822390WNx5 = EnumC822390WNx.Str;
                C0WN7 c0wn74 = this.LIZ;
                if (c0wn74 != null && (uri = c0wn74.LJ) != null) {
                    host = uri.getHost();
                }
                valueModel = new ValueModel(enumC822390WNx5, host, EnumC822390WNx.Null);
            }
        } else {
            EnumC822390WNx enumC822390WNx6 = EnumC822390WNx.Str;
            C0WN7 c0wn75 = this.LIZ;
            if (c0wn75 != null) {
                host = c0wn75.LIZLLL;
            }
            valueModel = new ValueModel(enumC822390WNx6, host, EnumC822390WNx.Null);
        }
        return new C0WO4() { // from class: X.0WNz
            @Override // X.C0WO4
            public final /* bridge */ /* synthetic */ ValueModel value() {
                return valueModel;
            }
        };
    }
}
