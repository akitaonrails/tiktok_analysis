package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C636002dy extends Message<C636002dy, C636102dz> {
    public static final ProtoAdapter<C636002dy> ADAPTER = new ProtoAdapter<C636002dy>() { // from class: X.02dx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C636002dy decode(ProtoReader protoReader) {
            C636002dy c636002dy = new C636002dy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c636002dy.redirect_uri = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c636002dy.button_label = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c636002dy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C636002dy c636002dy) {
            C636002dy c636002dy2 = c636002dy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c636002dy2.button_label) + protoAdapter.encodedSizeWithTag(2, c636002dy2.redirect_uri) + c636002dy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C636002dy c636002dy) {
            C636002dy c636002dy2 = c636002dy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c636002dy2.button_label);
            protoAdapter.encodeWithTag(protoWriter, 2, c636002dy2.redirect_uri);
            protoWriter.writeBytes(c636002dy2.unknownFields());
        }
    };
    public String button_label;
    public String redirect_uri;

    public C636002dy() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C636102dz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
