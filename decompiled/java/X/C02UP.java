package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02UP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02UP extends Message<C02UP, C02UQ> {
    public static final ProtoAdapter<C02UP> ADAPTER = new ProtoAdapter<C02UP>() { // from class: X.02UO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02UP decode(ProtoReader protoReader) {
            C02UP c02up = new C02UP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02up.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02up.icon = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02up.content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02up;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02UP c02up) {
            C02UP c02up2 = c02up;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02up2.content) + C673002jw.ADAPTER.encodedSizeWithTag(2, c02up2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02up2.type) + c02up2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02UP c02up) {
            C02UP c02up2 = c02up;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02up2.content);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c02up2.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c02up2.type);
            protoWriter.writeBytes(c02up2.unknownFields());
        }
    };
    public String content;
    public C673002jw icon;
    public Integer type;

    public C02UP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02UQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
