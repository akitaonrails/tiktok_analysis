package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5417029f extends Message<C5417029f, C02NE> {
    public static final ProtoAdapter<C5417029f> ADAPTER = new ProtoAdapter<C5417029f>() { // from class: X.024A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5417029f decode(ProtoReader protoReader) {
            C5417029f c5417029f = new C5417029f();
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
                                        c5417029f.link_text = C544002Ac.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c5417029f.mix_link_description = C547802Bo.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c5417029f.logos.add(C029C.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c5417029f.plain_description = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c5417029f.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5417029f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5417029f c5417029f) {
            C5417029f c5417029f2 = c5417029f;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c5417029f2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c5417029f2.plain_description) + C029C.ADAPTER.asRepeated().encodedSizeWithTag(3, c5417029f2.logos) + C547802Bo.ADAPTER.encodedSizeWithTag(4, c5417029f2.mix_link_description) + C544002Ac.ADAPTER.encodedSizeWithTag(5, c5417029f2.link_text) + c5417029f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5417029f c5417029f) {
        }
    };
    public C544002Ac link_text;
    public List<C029C> logos;
    public C547802Bo mix_link_description;
    public String plain_description;
    public Integer type;

    public C5417029f() {
        super(ADAPTER, ByteString.EMPTY);
        this.logos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
