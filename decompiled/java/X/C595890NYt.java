package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595890NYt extends ITTMParamData {
    public final List<C869590Y9l> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C595890NYt) && Intrinsics.LJFF(this.LIZIZ, ((C595890NYt) obj).LIZIZ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 3;
    }

    public final int hashCode() {
        List<C869590Y9l> list = this.LIZIZ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PSPMessageArray(messageList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getArraySize() {
        List<C869590Y9l> list = this.LIZIZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C595890NYt(List<? extends C869590Y9l> list) {
        this.LIZIZ = list;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getArrayItem(int i) {
        final C869590Y9l c869590Y9l;
        List<C869590Y9l> list = this.LIZIZ;
        if (list != null && (c869590Y9l = (C869590Y9l) ListProtector.get(list, i)) != null) {
            return new ITTMParamData(c869590Y9l) { // from class: X.0YZW
                public final C869590Y9l LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0YZW) && Intrinsics.LJFF(this.LIZIZ, ((C0YZW) obj).LIZIZ);
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final Object getInputData() {
                    return this;
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final int getType() {
                    return 2;
                }

                public final int hashCode() {
                    C869590Y9l c869590Y9l2 = this.LIZIZ;
                    if (c869590Y9l2 == null) {
                        return 0;
                    }
                    return c869590Y9l2.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PSPMessage(message=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZIZ = c869590Y9l;
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final ITTMParamData getObjectItem(String str) {
                    Map<String, String> ext;
                    if (Intrinsics.LJFF(str, "msg_ext")) {
                        return new ITTMParamData(this.LIZIZ) { // from class: X.06Ec
                            public final C869590Y9l LIZIZ;

                            public final boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                return (obj instanceof C1573606Ec) && Intrinsics.LJFF(this.LIZIZ, ((C1573606Ec) obj).LIZIZ);
                            }

                            @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                            public final Object getInputData() {
                                return this;
                            }

                            @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                            public final int getType() {
                                return 2;
                            }

                            public final int hashCode() {
                                C869590Y9l c869590Y9l2 = this.LIZIZ;
                                if (c869590Y9l2 == null) {
                                    return 0;
                                }
                                return c869590Y9l2.hashCode();
                            }

                            public final String toString() {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("PSPMessageExt(message=");
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(')');
                                return C2188811AlT.LIZIZ(sbLIZ);
                            }

                            {
                                this.LIZIZ = c869590Y9l;
                            }

                            @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                            public final String getStringValue(String str2, int i2) {
                                C869590Y9l c869590Y9l2;
                                Map<String, String> ext2;
                                String str3;
                                if (str2 == null || (c869590Y9l2 = this.LIZIZ) == null || (ext2 = c869590Y9l2.getExt()) == null || (str3 = ext2.get(str2)) == null) {
                                    return "";
                                }
                                return str3;
                            }
                        };
                    }
                    Map<String, String> map = null;
                    if (!Intrinsics.LJFF(str, "extra")) {
                        return null;
                    }
                    C869590Y9l c869590Y9l2 = this.LIZIZ;
                    if (c869590Y9l2 != null) {
                        ext = c869590Y9l2.getExt();
                    } else {
                        ext = null;
                    }
                    if (ext instanceof Map) {
                        map = ext;
                    }
                    return new TTMParamData((Map<String, Object>) map).getActualParamData();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final long getIntValue(String str, int i2) {
                    Integer numValueOf;
                    boolean z;
                    C869590Y9l c869590Y9l2;
                    Long lValueOf;
                    long j;
                    C869590Y9l c869590Y9l3;
                    C869590Y9l c869590Y9l4;
                    C869590Y9l c869590Y9l5 = this.LIZIZ;
                    Integer numValueOf2 = null;
                    if (c869590Y9l5 != null) {
                        numValueOf = Integer.valueOf(c869590Y9l5.getMsgStatus());
                    } else {
                        numValueOf = null;
                    }
                    C869590Y9l c869590Y9l6 = this.LIZIZ;
                    if (c869590Y9l6 != null) {
                        numValueOf2 = Integer.valueOf(c869590Y9l6.getSvrStatus());
                    }
                    if (C0YE1.LIZ.contains(numValueOf) && numValueOf2 != null && numValueOf2.intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1286065038:
                                if (str.equals("message_type") && (c869590Y9l4 = this.LIZIZ) != null) {
                                    lValueOf = Long.valueOf(c869590Y9l4.getMsgType());
                                }
                                break;
                            case -1100789634:
                                if (str.equals("index_of_conversation") && (c869590Y9l3 = this.LIZIZ) != null) {
                                    lValueOf = Long.valueOf(c869590Y9l3.getIndex());
                                }
                                break;
                            case -707141008:
                                if (str.equals("msg_status")) {
                                    if (z) {
                                        j = 1;
                                    } else {
                                        j = 0;
                                    }
                                    lValueOf = Long.valueOf(j);
                                }
                                break;
                            case 1369680106:
                                if (str.equals("created_at") && (c869590Y9l2 = this.LIZIZ) != null) {
                                    lValueOf = Long.valueOf(c869590Y9l2.getCreatedAt());
                                }
                                break;
                        }
                        if (lValueOf != null) {
                            return lValueOf.longValue();
                        }
                    }
                    return 0L;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final String getStringValue(String str, int i2) {
                    C869590Y9l c869590Y9l2;
                    String string;
                    C869590Y9l c869590Y9l3;
                    C869590Y9l c869590Y9l4;
                    C869590Y9l c869590Y9l5;
                    C869590Y9l c869590Y9l6;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1214899628:
                                if (str.equals("message_scene") && (c869590Y9l6 = this.LIZIZ) != null) {
                                    string = c869590Y9l6.getScene();
                                    if (string != null) {
                                    }
                                }
                                break;
                            case -905962955:
                                if (str.equals("sender") && (c869590Y9l5 = this.LIZIZ) != null) {
                                    string = Long.valueOf(c869590Y9l5.getSender()).toString();
                                    if (string != null) {
                                    }
                                }
                                break;
                            case -419323305:
                                if (!str.equals("conversation_id") || (c869590Y9l4 = this.LIZIZ) == null || (string = c869590Y9l4.getConversationId()) == null) {
                                }
                                break;
                            case 3601339:
                                if (str.equals("uuid") && (c869590Y9l3 = this.LIZIZ) != null) {
                                    string = c869590Y9l3.getUuid();
                                    if (string != null) {
                                    }
                                }
                                break;
                            case 954120981:
                                if (str.equals("server_msg_id") && (c869590Y9l2 = this.LIZIZ) != null) {
                                    string = Long.valueOf(c869590Y9l2.getMsgId()).toString();
                                    if (string != null) {
                                    }
                                }
                                break;
                        }
                    }
                    return "";
                }
            };
        }
        return null;
    }
}
