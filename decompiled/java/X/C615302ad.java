package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C615302ad extends Message<C615302ad, C615402ae> {
    public static final ProtoAdapter<C615302ad> ADAPTER = new ProtoAdapter<C615302ad>() { // from class: X.02ac
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C615302ad decode(ProtoReader protoReader) {
            C615302ad c615302ad = new C615302ad();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c615302ad.horizontal = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c615302ad.vertical.add(ProtoAdapter.FLOAT.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c615302ad;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C615302ad c615302ad) {
            C615302ad c615302ad2 = c615302ad;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c615302ad2.vertical) + protoAdapter.encodedSizeWithTag(2, c615302ad2.horizontal) + c615302ad2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C615302ad c615302ad) {
            C615302ad c615302ad2 = c615302ad;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c615302ad2.vertical);
            protoAdapter.encodeWithTag(protoWriter, 2, c615302ad2.horizontal);
            protoWriter.writeBytes(c615302ad2.unknownFields());
        }
    };
    public Float horizontal;
    public List<Float> vertical;

    public C615302ad() {
        super(ADAPTER, ByteString.EMPTY);
        this.vertical = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C615402ae newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
