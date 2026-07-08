package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557902Fl extends Message<C557902Fl, C02KB> {
    public static final ProtoAdapter<C557902Fl> ADAPTER = new ProtoAdapter<C557902Fl>() { // from class: X.028Z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557902Fl decode(ProtoReader protoReader) {
            C557902Fl c557902Fl = new C557902Fl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557902Fl.end_time = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c557902Fl.start_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c557902Fl.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557902Fl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557902Fl c557902Fl) {
            C557902Fl c557902Fl2 = c557902Fl;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c557902Fl2.text);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c557902Fl2.start_time) + protoAdapter.encodedSizeWithTag(3, c557902Fl2.end_time) + c557902Fl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C557902Fl c557902Fl) {
            C557902Fl c557902Fl2 = c557902Fl;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c557902Fl2.text);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c557902Fl2.start_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c557902Fl2.end_time);
            protoWriter.writeBytes(c557902Fl2.unknownFields());
        }
    };
    public Long end_time;
    public Long start_time;
    public String text;

    public C557902Fl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
