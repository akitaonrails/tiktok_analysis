package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C545802Au extends Message<C545802Au, C02I8> {
    public static final ProtoAdapter<C545802Au> ADAPTER = new ProtoAdapter<C545802Au>() { // from class: X.0268
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C545802Au decode(ProtoReader protoReader) {
            C545802Au c545802Au = new C545802Au();
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
                                        c545802Au.high_resolution_url.add(ProtoAdapter.STRING.decode(protoReader));
                                    }
                                } else {
                                    c545802Au.mid_resolution_url.add(ProtoAdapter.STRING.decode(protoReader));
                                }
                            } else {
                                c545802Au.low_resolution_url.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c545802Au.expression.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c545802Au.sticker_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c545802Au;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C545802Au c545802Au) {
            C545802Au c545802Au2 = c545802Au;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c545802Au2.sticker_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c545802Au2.expression) + protoAdapter.asRepeated().encodedSizeWithTag(3, c545802Au2.low_resolution_url) + protoAdapter.asRepeated().encodedSizeWithTag(4, c545802Au2.mid_resolution_url) + protoAdapter.asRepeated().encodedSizeWithTag(5, c545802Au2.high_resolution_url) + c545802Au2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C545802Au c545802Au) {
            C545802Au c545802Au2 = c545802Au;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c545802Au2.sticker_id);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c545802Au2.expression);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c545802Au2.low_resolution_url);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, c545802Au2.mid_resolution_url);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c545802Au2.high_resolution_url);
            protoWriter.writeBytes(c545802Au2.unknownFields());
        }
    };
    public List<String> expression;
    public List<String> high_resolution_url;
    public List<String> low_resolution_url;
    public List<String> mid_resolution_url;
    public Long sticker_id;

    public C545802Au() {
        super(ADAPTER, ByteString.EMPTY);
        this.expression = C1516540pZE.LJIIIIZZ();
        this.low_resolution_url = C1516540pZE.LJIIIIZZ();
        this.mid_resolution_url = C1516540pZE.LJIIIIZZ();
        this.high_resolution_url = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02I8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
