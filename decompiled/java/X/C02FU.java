package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FU extends Message<C02FU, C571802Ku> {
    public static final ProtoAdapter<C02FU> ADAPTER = new ProtoAdapter<C02FU>() { // from class: X.026p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FU decode(ProtoReader protoReader) {
            C02FU c02fu = new C02FU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02fu.show_time = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c02fu.is_show = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02fu.event_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FU c02fu) {
            C02FU c02fu2 = c02fu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02fu2.event_name) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c02fu2.is_show) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c02fu2.show_time) + c02fu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FU c02fu) {
            C02FU c02fu2 = c02fu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02fu2.event_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c02fu2.is_show);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c02fu2.show_time);
            protoWriter.writeBytes(c02fu2.unknownFields());
        }
    };
    public String event_name;
    public Boolean is_show;
    public Double show_time;

    public C02FU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571802Ku newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
