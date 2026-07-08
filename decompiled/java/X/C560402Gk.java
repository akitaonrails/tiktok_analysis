package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560402Gk extends Message<C560402Gk, C573202Li> {
    public static final ProtoAdapter<C560402Gk> ADAPTER = new ProtoAdapter<C560402Gk>() { // from class: X.029H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560402Gk decode(ProtoReader protoReader) {
            C560402Gk c560402Gk = new C560402Gk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560402Gk.bitrate_image = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c560402Gk.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560402Gk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560402Gk c560402Gk) {
            C560402Gk c560402Gk2 = c560402Gk;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c560402Gk2.name) + C673002jw.ADAPTER.encodedSizeWithTag(2, c560402Gk2.bitrate_image) + c560402Gk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C560402Gk c560402Gk) {
            C560402Gk c560402Gk2 = c560402Gk;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c560402Gk2.name);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c560402Gk2.bitrate_image);
            protoWriter.writeBytes(c560402Gk2.unknownFields());
        }
    };
    public C673002jw bitrate_image;
    public String name;

    public C560402Gk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573202Li newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
