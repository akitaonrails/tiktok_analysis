package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AU extends Message<C02AU, C564802Ic> {
    public static final ProtoAdapter<C02AU> ADAPTER = new ProtoAdapter<C02AU>() { // from class: X.024q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AU decode(ProtoReader protoReader) {
            C02AU c02au = new C02AU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 7) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c02au.extra = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c02au.questions.add(C546102Ax.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c02au.additional_content = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02au.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02au.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02au.id = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02au;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AU c02au) {
            C02AU c02au2 = c02au;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02au2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02au2.name) + protoAdapter.encodedSizeWithTag(3, c02au2.type) + protoAdapter2.encodedSizeWithTag(4, c02au2.additional_content) + C546102Ax.ADAPTER.asRepeated().encodedSizeWithTag(5, c02au2.questions) + protoAdapter2.encodedSizeWithTag(7, c02au2.extra) + c02au2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02AU c02au) {
            C02AU c02au2 = c02au;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02au2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02au2.name);
            protoAdapter.encodeWithTag(protoWriter, 3, c02au2.type);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02au2.additional_content);
            C546102Ax.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c02au2.questions);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02au2.extra);
            protoWriter.writeBytes(c02au2.unknownFields());
        }
    };
    public String additional_content;
    public String extra;
    public Integer id;
    public String name;
    public List<C546102Ax> questions;
    public Integer type;

    public C02AU() {
        super(ADAPTER, ByteString.EMPTY);
        this.questions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C564802Ic newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
