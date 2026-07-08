package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C3 extends Message<C02C3, C02KF> {
    public static final ProtoAdapter<C02C3> ADAPTER = new ProtoAdapter<C02C3>() { // from class: X.028G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C3 decode(ProtoReader protoReader) {
            C02C3 c02c3 = new C02C3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02c3.tagged_users.add(C028F.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02c3.video_label_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02c3.interest_level = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C3 c02c3) {
            C02C3 c02c32 = c02c3;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02c32.interest_level) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02c32.video_label_text) + C028F.ADAPTER.asRepeated().encodedSizeWithTag(3, c02c32.tagged_users) + c02c32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02C3 c02c3) {
            C02C3 c02c32 = c02c3;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02c32.interest_level);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c02c32.video_label_text);
            C028F.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c02c32.tagged_users);
            protoWriter.writeBytes(c02c32.unknownFields());
        }
    };
    public Integer interest_level;
    public List<C028F> tagged_users;
    public String video_label_text;

    public C02C3() {
        super(ADAPTER, ByteString.EMPTY);
        this.tagged_users = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
