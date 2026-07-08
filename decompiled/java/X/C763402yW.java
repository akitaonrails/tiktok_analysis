package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C763402yW extends Message<C763402yW, C763302yV> {
    public static final ProtoAdapter<C763402yW> ADAPTER = new ProtoAdapter<C763402yW>() { // from class: X.02yX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C763402yW decode(ProtoReader protoReader) {
            C763402yW c763402yW = new C763402yW();
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
                                    c763402yW.image = C02U1.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c763402yW.text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c763402yW.position = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c763402yW.style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c763402yW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C763402yW c763402yW) {
            C763402yW c763402yW2 = c763402yW;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c763402yW2.style) + protoAdapter.encodedSizeWithTag(2, c763402yW2.position) + ProtoAdapter.STRING.encodedSizeWithTag(3, c763402yW2.text) + C02U1.ADAPTER.encodedSizeWithTag(4, c763402yW2.image) + c763402yW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C763402yW c763402yW) {
        }
    };
    public C02U1 image;
    public Integer position;
    public Integer style;
    public String text;

    public C763402yW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C763302yV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
