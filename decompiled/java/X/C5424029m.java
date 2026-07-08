package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5424029m extends Message<C5424029m, C584402Pq> {
    public static final ProtoAdapter<C5424029m> ADAPTER = new ProtoAdapter<C5424029m>() { // from class: X.028P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5424029m decode(ProtoReader protoReader) {
            C5424029m c5424029m = new C5424029m();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c5424029m.da_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c5424029m.ui_style = C680702lB.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c5424029m.promotion_placement = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c5424029m.placement_labels.add(C549002Ca.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c5424029m.promotion_labels.add(C5256023a.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5424029m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5424029m c5424029m) {
            C5424029m c5424029m2 = c5424029m;
            return C5256023a.ADAPTER.asRepeated().encodedSizeWithTag(1, c5424029m2.promotion_labels) + C549002Ca.ADAPTER.asRepeated().encodedSizeWithTag(2, c5424029m2.placement_labels) + ProtoAdapter.INT32.encodedSizeWithTag(3, c5424029m2.promotion_placement) + C680702lB.ADAPTER.encodedSizeWithTag(4, c5424029m2.ui_style) + ProtoAdapter.STRING.encodedSizeWithTag(5, c5424029m2.da_info) + c5424029m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5424029m c5424029m) {
        }
    };
    public String da_info;
    public List<C549002Ca> placement_labels;
    public List<C5256023a> promotion_labels;
    public Integer promotion_placement;
    public C680702lB ui_style;

    public C5424029m() {
        super(ADAPTER, ByteString.EMPTY);
        this.promotion_labels = C1516540pZE.LJIIIIZZ();
        this.placement_labels = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C584402Pq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
