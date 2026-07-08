package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C562402He extends Message<C562402He, C02JS> {
    public static final ProtoAdapter<C562402He> ADAPTER = new ProtoAdapter<C562402He>() { // from class: X.02Hd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C562402He decode(ProtoReader protoReader) {
            C562402He c562402He = new C562402He();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c562402He.version = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c562402He.actions.add(C562202Hc.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c562402He.fields = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c562402He.type = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c562402He;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C562402He c562402He) {
            C562402He c562402He2 = c562402He;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c562402He2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c562402He2.fields) + C562202Hc.ADAPTER.asRepeated().encodedSizeWithTag(3, c562402He2.actions) + protoAdapter.encodedSizeWithTag(4, c562402He2.version) + c562402He2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C562402He c562402He) {
            C562402He c562402He2 = c562402He;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c562402He2.type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c562402He2.fields);
            C562202Hc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c562402He2.actions);
            protoAdapter.encodeWithTag(protoWriter, 4, c562402He2.version);
            protoWriter.writeBytes(c562402He2.unknownFields());
        }
    };
    public List<C562202Hc> actions;
    public String fields;
    public Long type;
    public String version;

    public C562402He() {
        super(ADAPTER, ByteString.EMPTY);
        this.actions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
